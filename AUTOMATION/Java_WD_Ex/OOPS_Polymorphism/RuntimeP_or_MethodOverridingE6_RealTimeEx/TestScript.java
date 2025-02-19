package RuntimeP_or_MethodOverridingE6_RealTimeEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class BasePage {
	WebDriver driver;

	public BasePage() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
	}

	public WebElement findElementMtd(By locator) {
		return driver.findElement(locator);
	}

	public void quit() {
		driver.quit();
	}
}

class CustomPage extends BasePage {
	@Override
	public WebElement findElementMtd(By locator) {
		try {
			System.out.println("Finding element: " + locator);
			return super.findElementMtd(locator);
		} catch (Exception e) {
			System.out.println("Element not found: " + locator);
			return null;
		}
	}
}

public class TestScript {
	public static void main(String[] args) {
		CustomPage cp = new CustomPage();
		cp.findElementMtd(By.id("username"));
		cp.quit();
	}
}
