package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E41c_JsE_GenerateAlert {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//to open URL
		jse.executeScript("window.location='https://login.salesforce.com/'");
		
		//to generate Alert
		jse.executeScript("alert('Javascript Executor generated alert message');");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
