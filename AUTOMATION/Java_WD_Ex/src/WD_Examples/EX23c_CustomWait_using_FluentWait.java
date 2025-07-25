package WD_Examples;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

// Write custom wait using FluentWait
public class EX23c_CustomWait_using_FluentWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com");

		// Create FluentWait instance
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) // max wait time
				.pollingEvery(Duration.ofSeconds(2)) // check every 2 seconds
				.ignoring(NoSuchElementException.class); // ignore this exception

		// Apply custom wait
		WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement el = driver.findElement(By.id("dynamicElement"));
				if (el.isDisplayed()) {
					System.out.println("Element is visible!");
					return el;
				} else {
					return null; // keep waiting
				}
			}
		});

		// Now interact with the element
		element.click();

		driver.quit();
	}
}
