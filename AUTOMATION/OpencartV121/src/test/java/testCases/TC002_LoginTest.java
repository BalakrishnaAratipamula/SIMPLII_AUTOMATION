package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC002_LoginTest extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verify_login() {
		// code to captureScreenshot while script is executing
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("MethodName: " + methodName);
		ExtentTest test = ExtentReportManager.captureScreenshotOnExecution(methodName);

		logger.info("***** Startign TC_002_LoginTest *****");
		logger.debug("This is a debug log message");
		
		try {
			// HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshot("MyAccountLinkDD.jpg"), "Clicked on MyAccount Link");
			hp.clickLogin();

			// Login
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(prop.getProperty("email"));
			lp.setPassword(prop.getProperty("password"));
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshot("LoginDetails.jpg"), "Login Details Entered");
			lp.clickLogin();

			// MyAccount
			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetPage = macc.isMyAccountPageExists();
			System.out.println("Page Title: "+driver.getTitle());
			
			Assert.assertTrue(targetPage);// Assert.assertEquals(targetPage, true,"Login failed");
		
			new HomePage(driver).clickMyAccount();
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshot("MyAccountLinkDD_.jpg"), "Clicked on MyAccount Link_");
			
			macc.clickLogout();
			
		} catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
			//or Assert.fail();
		}finally {
			logger.info("***** Finished TC_002_LoginTest *****");
		}
		
	}

}
