package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E14_PrintNumberOfLinksInaPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//to get all links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links:  "+links.size());
		
		//print links name
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
