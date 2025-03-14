package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36g_MouseHover {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//User 1 - 1st image
		WebElement mouseMenu = driver.findElement(By.cssSelector(".figure>img"));
		
		//creating obj for ACtions class
		Actions act = new Actions(driver);
		//perform mousehover
		act.moveToElement(mouseMenu).perform(); 
		
		//mouse hover text
		String str = driver.findElement(By.cssSelector(".figcaption>h5")).getText();
		System.out.println("mouse hover text:  "+str);
		Thread.sleep(2000);
		
		driver.quit(); 
	}
}
