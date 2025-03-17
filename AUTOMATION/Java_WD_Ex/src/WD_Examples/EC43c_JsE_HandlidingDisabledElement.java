package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EC43c_JsE_HandlidingDisabledElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Edit Box
		WebElement editBox = driver.findElement(By.cssSelector("#enabled-example-input"));
		boolean result = editBox.isEnabled();
		System.out.println("Before click on [Disable] status of 'Is Element Enable?':  "+result);
		editBox.click();
		editBox.sendKeys("AAAAAAAAAA");
		
		//click on [Disable]
		driver.findElement(By.cssSelector("#disabled-button")).click();
		result = editBox.isEnabled();
		System.out.println("After click on [Disable] status of 'Is Element Enable?':  "+result);
		editBox.click();
		
		if(result==false) { //When element is disabled 'InvalidElementStateException' will occur 
			//to handle 'Disabled' elements
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].removeAttribute('disabled','disabled')", editBox);
			editBox.clear();
			editBox.sendKeys("BBBBBBBBB");
		}
		
		Thread.sleep(5000);
//		driver.quit();
	}
}
