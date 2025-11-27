package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX44c_JsE_SetAttribute {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		
		WebElement ele = driver.findElement(By.id("idValue"));
		
		//to create javascriptExecutor interface object by TypeCasting
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//Remove element from DOM
		js.executeScript("arguments[0].setAttribute('value', 'newValue');", ele);
	}
}
