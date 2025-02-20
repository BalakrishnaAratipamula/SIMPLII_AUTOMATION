package Automation.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class E1c_Launching_Different_Browsers {
	public static void main(String[] args) {

		// Launching FireFox browser
		// Initialize the WebDriver with Browser driver
		WebDriver driver = new FirefoxDriver();
		// Launch the browser
		driver.navigate().to("https://www.google.co.in/");

		System.out.println("Launched Firefox Browser");
		//to Print 'SessionId'
		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session ID is: " + sessionId);
		 //*/
		
		
		/*/ Launching MS Edge browser
		// Initialize the WebDriver with Browser driver
		WebDriver driver = new EdgeDriver();
		// Launch the browser
		driver.navigate().to("https://www.google.co.in/");

		System.out.println("Launched MS Edge Browser"); //*/
		
		driver.quit();
	}
}
