package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E34_KB_Events_or_Operators {
	//Here my motive is to perform 3 times 'ArrowDown' 1 time 'ArrowUp' and perform 'Enter' Activity
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//search button
		WebElement txtSearch = driver.findElement(By.cssSelector("[name='q']"));
		txtSearch.sendKeys("Selenium WebDriver");
		Thread.sleep(4000);
		txtSearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		txtSearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		txtSearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		txtSearch.sendKeys(Keys.ARROW_UP);
		Thread.sleep(4000);
		txtSearch.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit(); 
	}
}
