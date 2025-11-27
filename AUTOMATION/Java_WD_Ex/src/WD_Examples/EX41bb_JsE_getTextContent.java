package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX41bb_JsE_getTextContent {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		
		WebElement ele = driver.findElement(By.id("idValue"));
		
		//to create javascriptExecutor interface object by TypeCasting
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//Get Text Conetent
		String text = (String) js.executeScript("return arguments[0].textContent;", ele);
		
		//Wait for AJAX completion (jQuery)
		js.executeScript("return jQuery.active == 0");
		js.executeScript("return document.readyState").equals("complete");
	}
}
