package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC003_LogoutTest extends BaseClass {
	@Test
	public static void verify_logout_test() {
		//capturing the method name to pass while capturing the screenshot
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("Method Name:  "+methodName);
		ExtentTest test = ExtentReportManager.gettingMethodNameToCreateTestForTestMethod(methodName);
		
		logger.info("*****Starting TC003_LogoutTest*****");
		logger.debug("This is a debug log message");
		
		try {
			//MyAccountPage
			MyAccountPage map = new MyAccountPage(driver);
			logger.info("*****Starting TC003_LogoutTest*****");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("MyAccountPage__.jpg"), "Navigated to 'MyAccount Page'");
			
			System.out.println("PageTitle:  "+driver.getTitle());
			//validation
			boolean targetPageText = map.isMyAccountTextOrYourAccountHasBeenCreatedTextExists();
			Assert.assertTrue(targetPageText);
			
			new HomePage(driver).clickMyAccountTab();
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("MyAccountTab__.jpg"), "Clicked on 'My Account' Tab");
			
			map.clickLogout();
			logger.info("Clicked on Logout");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("Logout.jpg"), "Clicked on Logout");
			
			
			logger.info("Test Passed");
			
		} catch(Exception e) {
			logger.error("Test failed:  "+e.getMessage());
			Assert.fail("Test failed:  "+e.getMessage());
		} finally {
			logger.info("*****Finished TC003_LogoutTest*****");
		}
		
	}
}
