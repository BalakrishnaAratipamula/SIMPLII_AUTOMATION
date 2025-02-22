package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E8_StaticDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

		//Register
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(800);
		
		//perform scroll-down on page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 250)"); //(Horizontal, Vertical)

		//Country
		driver.findElement(By.cssSelector("[name='country']")).click();
		Thread.sleep(800);
		
		//to handle static dropdown we have to use 'Select' class
		Select select = new Select(driver.findElement(By.cssSelector("[name='country']")));
		
		//selectByVisibleText
		select.selectByVisibleText("ARGENTINA");
		Thread.sleep(5000);
		
		//selectByIndex
		select.selectByIndex(2); //2 - AMERICAN SAMOA
		Thread.sleep(5000);
		
		//selectByValue
		select.selectByValue("AUSTRALIA");
		
		
		Thread.sleep(5000); 
		driver.quit();
	}
}
