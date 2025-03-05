package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E24_Handling_JavaBasedPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://onlineap.meeseva.gov.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//user id field  
		driver.findElement(By.cssSelector("#userId")).sendKeys("AAAAAA");
		//Submit button
		driver.findElement(By.cssSelector("[name='btnsubmit']")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Error message from popup window is:     "+alertText);
		alert.accept(); //for 'OK'
//		alert.dismiss(); //for 'Cancel'
//		alert.sendKeys("some text"); //to enter text in Alert window text box
		
		System.out.println("Java based popup get handled with XPath");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
