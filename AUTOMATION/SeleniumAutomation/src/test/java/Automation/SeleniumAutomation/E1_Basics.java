package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1_Basics {
	public static void main(String[] args) throws InterruptedException {
		//Initialize the WebDriver with Browser driver
		WebDriver driver = new ChromeDriver(); //--RTP Concept
		
		//Launch the browser
		driver.get("https://www.google.co.in/");
		
		//to maximize the browser 
		driver.manage().window().maximize();
		
		//find the search box by 'id' WebElement
//		driver.findElement(By.id("APjFqb")).sendKeys("Selenium WebDriver");
		//find the search box by 'name' WebElement
//		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		//find the search box by 'className' WebElement
//		driver.findElement(By.className("gLFyf")).sendKeys("Selenium WebDriver");
		//find the search box by 'tagName' WebElement
//		driver.findElement(By.tagName("textarea")).sendKeys("Selenium WebDriver");
		//find the G-mail 'linkText' WebElement
//		driver.findElement(By.linkText("Gmail")).click();
		//find the G-mail 'partialLinkText' WebElement
//		driver.findElement(By.partialLinkText("Gma")).click();
		Thread.sleep(6000);
		
		System.out.println("Execution Done");
		//to close the browser
		driver.quit();
	
	}
}
