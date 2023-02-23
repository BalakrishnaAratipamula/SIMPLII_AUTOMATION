package Practice_Pa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX41_JsE_enter_data_in_editbox {
public static void main(String[] args) throws Exception {
	//to initialize browser
	System.setProperty("webdriver.gecko.driver", "E://Drivers//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	//Creating JavascriptExecutor interface object by TypeCasting
	//TypeCasting-----> We need to convert variable from one data type to another
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	//to open url
	js.executeScript("window.location='http://login.salesforce.com'");
	Thread.sleep(5000);
	js.executeScript("window.document.getElementById('username').value='bbbbbbbbbbbb'");
}
}
