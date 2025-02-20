package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1e_Browser_Interaction_Commands {
	public static void main(String[] args) throws InterruptedException {
		// Initialize the WebDriver with Browser driver
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		// Launching URL
		driver.get("https://en-gb.facebook.com/");
		// to maximize the browser window
		driver.manage().window().maximize();

		/*/ getPageSource
		String pageSource = driver.getPageSource();
		System.out.println("*********Page Source: \n" + pageSource); // */

		/*/ getCurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println("*********Current URL: \n" + currentUrl); // */
		
		/*/Page Title
		String pageTitle = driver.getTitle();
		System.out.println("*********Page Title: \n" + pageTitle); // */
		
		//get the Html code of WebElement -- getAttribute
		WebElement ele = driver.findElement(By.cssSelector("#email")); // 'Email address or phone number' //id
		String outerHtml = ele.getAttribute("name"); //outerHTML - for node printing
		System.out.println(outerHtml);
		
		
		Thread.sleep(3000);
		System.out.println("\nExecution Done");
		// to close the browser
		driver.quit();
	}
}
