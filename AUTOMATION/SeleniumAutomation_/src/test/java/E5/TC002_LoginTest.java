package E5;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC002_LoginTest extends BaseClass {
	@Test(groups = { "Sanity", "Master" })
	public void verify_login() {
		// code to captureScreenshot while script is executing
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("MethodName: " + methodName);
		ExtentTest test = ExtentReportManager.gettingMethodNameToCreateTestForExecutionTimeScreenshot(methodName);

		logger.info("***** Starting TC_002_LoginTest *****");
		logger.debug("This is a debug log message");
		
		try {
			// HomePage
			HomePage hp = new HomePage(driver);
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("HomePage.jpg"), "Enterd into 'Tutorials Ninja' HomePage");
			hp.clickMyAccountTab();
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("MyAccountTab_.jpg"), "Clicked on 'My Account' Tab");
			hp.clickLogin();
			logger.info("Navigated to 'Login Page'");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("LoginPage.jpg"), "Navigated to 'Login Page'");
			// Login
			LoginPage lp = new LoginPage(driver);
			/*/If we want to get the heard coded Email & Password from 'properties file'
			lp.setEmailLogin(prop.getProperty("email"));
			lp.setPasswordLogin(prop.getProperty("password")); //*/
			
			//If we want to get the latest generated Email & Password
			String email = TC001_AccountRegestrationTest.email;
			lp.setEmailLogin(email);
			logger.info("Enterd '"+email+"' as Email");
			String password = TC001_AccountRegestrationTest.password;
			lp.setPasswordLogin(password);
			logger.info("Enterd '"+password+"' as Password");
			
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("LoginDetails.jpg"), "Login Details Entered");
			lp.clickLoginBtn();
			logger.info("Navigated to 'Login Page'");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("LoggedInPage.jpg"), "Navigated to 'Logged in' page");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
			//or Assert.fail();
		}finally {
			logger.info("***** Finished TC_002_LoginTest *****");
		}
		
	}

}
