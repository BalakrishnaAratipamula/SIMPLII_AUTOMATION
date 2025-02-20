package Automation.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E1b_LaunchBrowser_using_WebDriverManager {
	public static void main(String[] args) {
		// to download driver binaries without having setup path
		WebDriverManager.chromedriver().setup(); //'WebDriverManager' is a class
		
		// Initialize the WebDriver with Browser driver
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		
		// Launch the browser
		driver.navigate().to("https://www.google.co.in/");

		// to maximize the browser page
		driver.manage().window().maximize();
		
		System.out.println("Execution Done");
		//to close the browser
		driver.quit();
		
	}
}