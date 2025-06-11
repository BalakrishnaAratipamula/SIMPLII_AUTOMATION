package WD_Examples;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//@ How to access phone number from 1000 pages?
public class EX75_Access_PhoneNumber_from_1000pages { //Ref program
	/*/M1
	public static void main(String[] args) {
		List<String> urls = getAllUrls(); // Assume you have all 1000 page URLs

		WebDriver driver = new ChromeDriver();

		for (String url : urls) {
		    driver.get(url);

		    // Wait for phone number element (modify locator as needed)
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".phone")));

		    String phoneNumber = phoneElement.getText();
		    System.out.println("Phone: " + phoneNumber);

		    // Optional: save to list, DB, or file
		}

		driver.quit();
	} //*/
	
	//M2
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com/page1"); // First page

		for (int i = 1; i <= 1000; i++) {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".phone")));

		        String phone = phoneElement.getText();
		        System.out.println("Page " + i + " Phone: " + phone);
		        
		        // Click next page button (adjust locator)
		        WebElement nextButton = driver.findElement(By.cssSelector(".next-button"));
		        nextButton.click();

		        Thread.sleep(1000); // Small wait to allow page load

		    } catch (Exception e) {
		        System.out.println("Error on page " + i + ": " + e.getMessage());
		        break; // or continue if pages are optional
		    }
		}

		driver.quit();
	}
}
