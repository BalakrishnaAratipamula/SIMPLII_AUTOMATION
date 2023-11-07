package SeleniumLatestFeaturesGroup.NewFeatures;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX01_SeleniumManager_BrowserManagement {
	
	@Test
	public void tesOnChrome() {
		final WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		assertEquals(driver.getTitle(), "Selenium");
		driver.quit();
	}
	
	@Test
	public void testOnFirefox() {
		final WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.selenium.dev/");
		assertEquals(driver.getTitle(), "Selenium");
		driver.quit();
	}
	
}
