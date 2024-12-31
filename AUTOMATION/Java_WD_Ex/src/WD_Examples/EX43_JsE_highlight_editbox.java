package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class EX43_JsE_highlight_editbox {
	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.gecko.driver", "E://Drivers//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		Thread.sleep(1500);	

		WebElement ele = driver.findElement(By.id("username"));

		JavascriptExecutor js = ((JavascriptExecutor)driver);

//		js.executeScript(" arguments[0].setAttribute('style' , 'background: yellow;    border: 2px dashed red;'); " , ele);
		js.executeScript(" arguments[0].style.border='2px solid red' ", ele);

	}
}
