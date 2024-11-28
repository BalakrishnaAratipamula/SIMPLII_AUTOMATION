package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX68_Swipe_by_ActionsClass {
	public static void main(String[] args) {
		// Set up WebDriver
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://example.com");
			WebElement swipeElement = driver.findElement(By.id("swipeTarget"));

			// Initialize the Actions class
			Actions actions = new Actions(driver);

			// Perform the swipe action
			actions.clickAndHold(swipeElement)
					.moveByOffset(200, 0) // Swipe horizontally (200px to the right)
					.release().perform();

			System.out.println("Swipe performed successfully!");

		} finally {
			driver.quit();
		}
	}
}
