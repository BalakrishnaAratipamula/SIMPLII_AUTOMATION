package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E43_JsE_HandlingDisabledElements {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//'Edit Box' under Enabled/Disabled Example
		WebElement editBox = driver.findElement(By.id("enabled-example-input"));
		boolean result = editBox.isEnabled();
		System.out.println("Before click on [Disable] status of 'Is element Enable?':  "+result);
		
		//click on [Disable]
		driver.findElement(By.id("disabled-button")).click();
		result = editBox.isEnabled();
		System.out.println("Afeter click on [Disable] status of 'Is element Enable?':  "+result);
		editBox.click();
		if(result==false) { //When elemnt is Disabled we will get 'InvalidElementStateException'
			//to handle 'Disable' elements
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].removeAttribute('disabled', 'disabled')", editBox);
			editBox.sendKeys("AAAAAAAA");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
