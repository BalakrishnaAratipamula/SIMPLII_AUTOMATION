package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX33__NewTab_using_JsE_M0 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();

			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Open a new tab
			js.executeScript("window.open();");

			// Get all window handles
			int i=1;
			for (String handle : driver.getWindowHandles()) {
				System.out.println("Handle"+i+": " + handle);
				i++;
			}

			// Switch to the newly opened tab (last handle)
			driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

			driver.get("https://www.bing.com");

			System.out.println("New tab title: " + driver.getTitle());
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			Thread.sleep(6000);
			driver.quit();
		}
	}
}
