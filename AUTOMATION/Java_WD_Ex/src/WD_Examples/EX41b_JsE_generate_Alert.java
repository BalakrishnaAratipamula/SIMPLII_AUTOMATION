package WD_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX41b_JsE_generate_Alert {
	public static void main(String[] args) throws InterruptedException {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//to open url
		js.executeScript("window.location='http://login.salesforce.com'"); 
		js.executeScript("alert('Javascript Executed');");
		Thread.sleep(6000);

		driver.quit();
	}
}