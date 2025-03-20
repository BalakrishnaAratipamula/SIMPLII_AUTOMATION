package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E58_StaleElementReferenceException_Handling {
	//StaleElementReferenceException can handle simply by the Re-finding mechanism (by iteration)
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*/Approach 1.
		// Re-finding mechanism (by iterating element using 'for')
		for (int i = 0; i < 3; i++) {
			try {
				WebElement ele = driver.findElement(By.id("nav-search-submit-button"));
				ele.click();
				break; // break the loop if interaction is successful
			} catch (StaleElementReferenceException e) {
				System.out.println("StaleElementReferenceException encountered, Re-locating....");
			}
		} //*/
		
		//Approach 2.
		try {
            WebElement element = driver.findElement(By.id("nav-search-submit-button"));
            element.click();
        } catch (StaleElementReferenceException e) {
            System.out.println("Element went stale. Re-locating...");
            WebElement element = driver.findElement(By.id("nav-search-submit-button"));
            element.click();
        } //*/
	}
}
