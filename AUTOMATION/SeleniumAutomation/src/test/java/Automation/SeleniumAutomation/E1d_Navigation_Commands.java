package Automation.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1d_Navigation_Commands {
	public static void main(String[] args) throws InterruptedException {
		// Initialize the WebDriver with Browser driver
		WebDriver driver = new ChromeDriver(); // --RTP Concept

		// Entering URL2
		driver.get("https://en-gb.facebook.com/");
		// to maximize the browser window
		driver.manage().window().maximize();

		// Entering URL2
		driver.navigate().to("https://www.google.co.in/");

		Thread.sleep(3000);
		//to navigate back
		driver.navigate().back();
		System.out.println("-----Back----");
		
		Thread.sleep(3000);
		//to refresh the page
		driver.navigate().refresh();
		System.out.println("-----Refresh----");
		
		Thread.sleep(3000);
		//to forward the page
		driver.navigate().forward();
		System.out.println("-----Forward----");
				
		Thread.sleep(3000);
		System.out.println("Execution Done");
		// to close the browser
		driver.quit();
	}
}