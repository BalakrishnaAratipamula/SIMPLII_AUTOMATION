package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX66_isElementPresent {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.amazon.in/");

            if (isElementPresent(driver, By.id("nav-search-submit-button"))) {
                System.out.println("Element is present.");
            } else {
                System.out.println("Element is not present.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
	}
	
	public static boolean isElementPresent(WebDriver driver, By locator) {
        try {
            // Try finding the element
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            // If element is not found, return false
            return false;
        }
    }
}
