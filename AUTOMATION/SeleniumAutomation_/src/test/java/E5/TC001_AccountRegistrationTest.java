package E5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class TC001_AccountRegistrationTest extends BaseClass{
	@Test
	public void verify_account_registration() throws InterruptedException {
		//code to captureScreenshot while script is executing
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("Executing MethodName: "+methodName );
		ExtentTest test = ExtentReportManager.captureScreenshotOnExecution(methodName);
		
		try {
			driver = new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			test.addScreenCaptureFromPath(captureScreenshot("HomePage.jpg"), "HomePage");
			driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();
			test.addScreenCaptureFromPath(captureScreenshot("MyAccountLinkDD.jpg"), "Clicked on MyAccount Link");
//			//test.addScreenCaptureFromPath(new BaseClass().captureScreen(methodName));
			driver.findElement(By.xpath("(//*[text()='Register'])[1]")).click();
			test.addScreenCaptureFromPath(captureScreenshot("RegisterPageBeforeFill.jpg"), "Register Page before fill");

			//for intentional Failing @@@@@@@@@@@@@
//			Assert.fail("Intentionally failing the test"); 
			
			//for intentional Skipping @@@@@@@@@@@@@
			boolean skipTest = true;
			if (skipTest) {
	            throw new SkipException("Condition met, so skipping the test");
	        }
			System.out.println("Test is running");
			
			Thread.sleep(2000);
			//navigating back to HomePage
			driver.navigate().back();			
			test.addScreenCaptureFromPath(captureScreenshot("NavigatedBackToHomePage.jpg"), "NavigatedBackToHomePage");
		} catch (Exception e) {
//			Assert.fail("Test failed: " + e.getMessage());
//		} finally {
//			Thread.sleep(5000);
//			driver.quit();
		}
	}
}
