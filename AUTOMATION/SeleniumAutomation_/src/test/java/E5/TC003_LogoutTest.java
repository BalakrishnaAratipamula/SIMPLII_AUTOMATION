package E5;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC003_LogoutTest extends BaseClass {
	@Test(groups = { "Sanity", "Master" })
	public static void verify_logout() {
		// code to captureScreenshot while script is executing
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("MethodName: " + methodName);
		ExtentTest test = ExtentReportManager.gettingMethodNameToCreateTestForExecutionTimeScreenshot(methodName);

		logger.info("***** Starting TC_003_LogoutTest *****");
		logger.debug("This is a debug log message");
		
		try {
			// MyAccount
			MyAccountPage macc = new MyAccountPage(driver);
			logger.info("***** We are in Logged-in page *****");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("MyAccountPage__.jpg"), "navigated to MyAccount Page");
			boolean targetPage = macc.isMyAccountTextOrYourAccountHasBeenCreatedTextExists();
			System.out.println("Page Title: "+driver.getTitle());
			
			Assert.assertTrue(targetPage);// Assert.assertEquals(targetPage, true,"Login failed");
		
			new HomePage(driver).clickMyAccountTab();
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("MyAccountTab__.jpg"), "Clicked on MyAccountTab__");
			
			macc.clickLogout(); 
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("LoggedOut.jpg"), "Clicked on Loggout");
			
		} catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
			//or Assert.fail();
		}finally {
			logger.info("***** Finished TC_003_LogoutTest *****");
		}
		
	}

}
