package TakingScreenshotOnlyForFailedTestCases_UsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(S2_TestNG_Listener_to_CaptureScreenshots_onFailure.class) //Attach Listener to Test Class
public class S3_TestClass {
	public WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
    }

    @Test
    public void test1() {
    	driver.findElement(By.id("username")).sendKeys("XYZ");
    	driver.findElement(By.name("Login")).click();
//        Assert.fail("This test is intentionally failing.");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        if (driver != null) {
        	Thread.sleep(5000);
            driver.quit();
        }
    }
}
