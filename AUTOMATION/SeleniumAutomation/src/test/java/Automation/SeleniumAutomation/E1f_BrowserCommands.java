package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1f_BrowserCommands {
	public static void main(String[] args) throws InterruptedException {
		// Initialize the WebDriver with Browser driver
		WebDriver driver = new ChromeDriver(); // --RTP Concept

		Dimension dimension = new Dimension(500, 500);
		driver.manage().window().setSize(dimension);
		
		
		// Launching URL
		driver.get("https://en-gb.facebook.com/");
		// to maximize the browser window
		driver.manage().window().maximize();
		
		//to get WebElement 'size' and 'location' for 'Email address or phone number'
		WebElement ele = driver.findElement(By.cssSelector("[name='email']"));
		System.out.println("Size:  "+ele.getSize()+"\nLocation:  "+ele.getLocation());
		
		//to get WebElement 'size' and 'location' for 'Login' button
		WebElement ele2 = driver.findElement(By.xpath("//*[@name='login']"));
		System.out.println("Size:  "+ele2.getSize()+"\nLocation:  "+ele2.getLocation());
		
		Thread.sleep(3000);
		System.out.println("Execution Done");
		//close browser window
		driver.quit();
	}
}
