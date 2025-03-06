package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E25_JavaScript_AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://example.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
