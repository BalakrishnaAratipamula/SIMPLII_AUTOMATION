package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36d_DoubleClick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 200)");
		
		//click on 'Double click me'
		WebElement button = driver.findElement(By.id("doubleClickBtn"));	
		
		//creating obj for ACtions class
		Actions act = new Actions(driver);
		//perform double click
		act.doubleClick(button).perform();
		Thread.sleep(2000);
		
		System.out.println("Double Click Message is:   "+driver.findElement(By.id("doubleClickMessage")).getText());
		
		Thread.sleep(5000);
		driver.quit(); 
	}
}
