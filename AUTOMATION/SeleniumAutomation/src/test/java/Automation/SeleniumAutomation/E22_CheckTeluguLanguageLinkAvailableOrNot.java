package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E22_CheckTeluguLanguageLinkAvailableOrNot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//Before click on Telugu link
		System.out.println("Before click on Telugu link");
		int n = driver.findElements(By.linkText("తెలుగు")).size();
		if(n!=0) 
			System.out.println("Number of Telugu links are:  "+n);
		else
			System.out.println("Telugu links is invisible");
		Thread.sleep(5000);
		
		//Clicking on Telugu link
		driver.findElement(By.linkText("తెలుగు")).click();
		
		//After click on Telugu link
		System.out.println("After click on Telugu link");
		n = driver.findElements(By.linkText("తెలుగు")).size();
		if(n!=0) 
			System.out.println("Number of Telugu links are:  "+n);
		else
			System.out.println("Telugu links is invisible");
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
