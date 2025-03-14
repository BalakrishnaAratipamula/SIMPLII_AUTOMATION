package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36f_MouseHover {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//'Hello, sign in' btn
		WebElement mouseMenu = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));	
		
		System.out.println("Window Page Title:  "+driver.getTitle());
		//creating obj for ACtions class
		Actions act = new Actions(driver);
		//perform mousehover
		act.moveToElement(mouseMenu).perform(); 
		
		//'Your Wish List' link
		driver.findElement(By.xpath("//span[text()='Your Wish List']")).click();
		Thread.sleep(2000);
		
		System.out.println("Window Page Title:  "+driver.getTitle());
		
		driver.quit(); 
	}
}
