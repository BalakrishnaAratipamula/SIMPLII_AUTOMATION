package ReRun_Failed_TCs_usingIRetryAnalyzer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test(retryAnalyzer = IRetryAnalyzer_Implementation.class) //className.class
	public void testMethod() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "google");	//Actual: Google
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
