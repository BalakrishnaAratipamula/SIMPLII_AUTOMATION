package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E41d_JsE_OpenUrl_in_NewTab {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//to open URL in new tab
		jse.executeScript("window.open('https://en-gb.facebook.com/', '_blank')");

		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
	}
}
