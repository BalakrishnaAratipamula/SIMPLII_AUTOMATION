package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E57_UserdefinedMethod_for_isElementPresent {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//'search' button
			if(isElementPresent(driver, By.id("nav-search-submit-button"))) //true
				System.out.println("Element is Present..");
			else //false
				System.out.println("Element is not Present..");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}
	
	//generic method to find whether the WebElement is present or not
	public static boolean isElementPresent(WebDriver driver, By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
