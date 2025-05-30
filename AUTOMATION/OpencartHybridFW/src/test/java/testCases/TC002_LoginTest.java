package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC002_LoginTest extends BaseClass {
	@Test
	public void verify_login_test() {
		//capturing the method name to pass while capturing the screenshot
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("Method Name:  "+methodName);
		ExtentTest test = ExtentReportManager.gettingMethodNameToCreateTestForTestMethod(methodName);
		
		logger.info("*****Starting TC002_LoginTest*****");
		logger.debug("This is a debug log message");
		
		try {
			//HomePage
			HomePage hp = new HomePage(driver);
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("HomePage.jpg"), "Navigated to 'Tutorials Ninja' HomePage");
			logger.info("Navigated to HomePage");
			hp.clickMyAccountTab();
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("MyAccountTab_.jpg"), "Clicked on 'My Account' Tab");
			hp.clickLogin();
			logger.info("Navigated to 'Login Page'");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("LoginPage.jpg"), "Navigated to 'Login Page'k");
			
			//Loin Details
			LoginPage lp = new LoginPage(driver);
			/*/if u want to pass the  heard coded values from the 'Properties file' use the below approach
			lp.setEmailLogin(prop.getProperty("email"));
			lp.setPasswordLogin(prop.getProperty("password")); //*/
			
			//if u want to pass the current generating data by 'RandomStringUtils' class use the below approach
			String email = TC001_AccountRegestrationTest.email;
			lp.setEmailLogin(email);
			logger.info("Entered "+email+" as Email ID");
			String password = TC001_AccountRegestrationTest.password;
			lp.setPasswordLogin(password);
			logger.info("Entered "+password+" as Password");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("LoginDetails.jpg"), "Login Details Enterd");
			lp.clickLoginBtn();
			logger.info("Navigated to Logged-in page");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("LoggedInPage.jpg"), "Navigated to Logged-In page");
			Thread.sleep(5000);
			
			logger.info("Test Passed");
			
		} catch(Exception e) {
			logger.error("Test failed:  "+e.getMessage());
			Assert.fail("Test failed:  "+e.getMessage());
		} finally {
			logger.info("*****Finished TC002_LoginTest*****");
		}
		
	}
}
