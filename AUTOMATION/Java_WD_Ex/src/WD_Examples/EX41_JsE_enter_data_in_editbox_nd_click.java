package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX41_JsE_enter_data_in_editbox_nd_click {
	public static void main(String[] args) throws InterruptedException  {
		//to initialize browser
		System.setProperty("webdriver.gecko.driver", "E://Drivers//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();

		//creating JavascriptExecutor interface object by TypeCasting ---- (JavascriptExecutor)driver)
		//TypeCasting -----> we need to convert variable from one data type to another 
		//TypeCasting -----> by type TypeCasting then only we can able to access the both WD & Js methods
		JavascriptExecutor js = ((JavascriptExecutor)driver);

		//to open url
		js.executeScript("window.location='http://login.salesforce.com'");
		Thread.sleep(5000);
		//to enter text in edit box
		js.executeScript("window.document.getElementById('username').value='aaaaaaaaaaaaa'");//shortcut will get correct
		Thread.sleep(1500);
		//to click on webElement
		WebElement ele = driver.findElement(By.name("Login"));
		js.executeScript("arguments[0].click();", ele);
	}
}
