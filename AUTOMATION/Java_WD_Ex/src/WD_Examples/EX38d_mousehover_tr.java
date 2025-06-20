package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX38d_mousehover_tr { // tricky
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		// Close the login popup
		try {
			WebElement closePopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
			closePopup.click();
		} catch (Exception e) {
			System.out.println("Login popup not displayed.");
		}

		// Locate the "Electronics" menu
		WebElement electronicsMenu = driver.findElement(By.xpath("//span[text()='Electronics']"));

		// Use Actions to hover
		Actions actions = new Actions(driver);
		actions.moveToElement(electronicsMenu).perform();

		// Wait to let sub-menu appear (optional)
		Thread.sleep(2000);

		// Click on a subcategory under Electronics (e.g., "Laptop Accessories")
		WebElement subCategory = driver.findElement(By.linkText("Laptop Accessories"));
		subCategory.click();

		Thread.sleep(3000);
		driver.quit();
	}
}
