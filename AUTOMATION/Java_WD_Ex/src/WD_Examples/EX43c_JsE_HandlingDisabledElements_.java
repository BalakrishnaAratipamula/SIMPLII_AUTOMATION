package WD_Examples;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX43c_JsE_HandlingDisabledElements_ {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//'Edit Box' under Enabled/Disabled Example
		WebElement editBox = driver.findElement(By.id("enabled-example-input"));
		boolean result1 = editBox.isEnabled(); //true
		boolean result2 = editBox.isDisplayed(); //true
		System.out.println("Before click on [Disable] status of 'Is element Enable?':  "+result1+"\tIs Element Displayed?:  "+result2);
		
		//click on [Disable]
		driver.findElement(By.id("disabled-button")).click();
		result1 = editBox.isEnabled(); //false
		result2 = editBox.isDisplayed(); //true
		System.out.println("Afeter click on [Disable] status of 'Is element Enable?':  "+result1+"\tIs Element Displayed?:  "+result2);
//		editBox.sendKeys("AAAAAAAA");
		if(result1==false) { //If element is Disable we will get 'ElementNotInteractableException'
			//to handle 'Disable' elements
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].removeAttribute('disabled', 'disabled')", editBox);
			editBox.sendKeys("AAAAAAAA");
		} //*/
		
		Thread.sleep(5000);
		driver.quit();
	}
}
