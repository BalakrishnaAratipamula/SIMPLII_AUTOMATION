package SeleniumLatestFeaturesGroup.NewFeatures;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class EX01_SeleniumManager_BrowserManagement2 {
	
	@Test
	public void testChromeVersion() {
		final ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("114");
		
		final WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		assertEquals(driver.getTitle(), "Selenium");
		// driver.quit();
	}
	
	@Test
	public void testFirefoxVersion() {
		final FirefoxOptions options = new FirefoxOptions();
		options.setBrowserVersion("112");
		
		final WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.selenium.dev/");
		assertEquals(driver.getTitle(), "Selenium");
		// driver.quit();
		
		
	}
	
	
	
}
