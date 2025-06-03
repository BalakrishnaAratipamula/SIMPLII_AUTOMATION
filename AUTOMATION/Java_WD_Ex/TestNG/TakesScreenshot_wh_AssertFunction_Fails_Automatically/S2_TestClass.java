package TakesScreenshot_wh_AssertFunction_Fails_Automatically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class S2_TestClass {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testCase1() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("ScreenShot Demo");
		Thread.sleep(4000);
		Assert.assertTrue(false); //fail
	}

	@Test
	public void testCase2() {
		Assert.assertTrue(true); //pass
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("Printing Act Result status: "+result.getStatus());
		System.out.println("Printing Exp Result status: "+result.FAILURE);
		if(result.FAILURE==result.getStatus()) {
			new S1_UtilityClass().takeScreenshot(driver, result.getName()); //driver, fileName 
		}
		driver.quit();
	}
}
