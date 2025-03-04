package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E10e_SynchronizationSyntax {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		// Unconditional Synchronization
		Thread.sleep(5000);
		
		//Conditional Synchronization
		//a) Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //NoSuchElementException will throw
		
		//b) Explicit Wait
		Wait<WebDriver> wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='idValue']"))); //ElementNotVisibleException will throw
		
		//c) Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='idValue']")));

	}
}










