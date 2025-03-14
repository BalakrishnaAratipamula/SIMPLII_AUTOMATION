package WD_Examples;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX41b_JsE_generate_Alert {
	//
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//to open url
		js.executeScript("window.location='http://login.salesforce.com'"); 
		js.executeScript("alert('Javascript Executed');");
		Thread.sleep(10000);

		driver.quit();
	} //*/
	
	/*/
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('This is an alert!!!!')");
		Thread.sleep(2000);
		
		driver.quit();
	} //*/
}