package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX41c_JsE_OpenLinkIn_NewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/"); //for SVG elements 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open('https://www.facebook.com/', '_blank')");

		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
}
