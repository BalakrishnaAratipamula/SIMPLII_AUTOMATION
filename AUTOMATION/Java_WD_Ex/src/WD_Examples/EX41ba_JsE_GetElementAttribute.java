package WD_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX41ba_JsE_GetElementAttribute {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Get Element Attribute
		String value = (String) js.executeScript("return document.getElementById('element').value");
		
		System.out.println("Attribute value:  "+value);
	}
}
