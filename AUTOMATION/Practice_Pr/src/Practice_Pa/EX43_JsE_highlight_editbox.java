package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX43_JsE_highlight_editbox {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "E://Drivers//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	
	WebElement ele1 = driver.findElement(By.id("username"));
	
	//to create JavascriptExecutor interface object by TypeCasting
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px dashed red;');", ele1);
	Thread.sleep(2000);
	
	//js.executeScript("window.document.getElementById('username').value='bhanu'");
	ele1.sendKeys("bhanu");
}
}
