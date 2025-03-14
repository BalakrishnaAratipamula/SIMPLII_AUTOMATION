package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36h_MouseHover {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://extentreports.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//'DOCS' ele
		WebElement docsMouseMenu = driver.findElement(By.xpath("//span[text()='Docs']"));
		
		//creating obj for ACtions class
		Actions act = new Actions(driver);
		//perform mousehover on 'DOCS'
		act.moveToElement(docsMouseMenu).perform(); 
		Thread.sleep(2000);
		
		//'Version 4' ele
		WebElement Version4MouseMenu = driver.findElement(By.xpath("//span[text()='Version 4']"));

		// perform mousehover 'Version 4'
		act.moveToElement(Version4MouseMenu).perform();
		Thread.sleep(2000);
				
		// to click on 'Klov'
		driver.findElement(By.xpath("(//*[@class='menu-vertical'])[3]/li[3]/a[text()='Klov']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
