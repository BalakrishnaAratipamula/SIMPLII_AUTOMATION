package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC001_AccountRegestrationTest extends BaseClass {
	public static String email;
	public static String password;
	
	@Test
	public void verify_account_registration() {
		//capturing the method name to pass while capturing the screenshot
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("Method Name:  "+methodName);
		ExtentTest test = ExtentReportManager.gettingMethodNameToCreateTestForTestMethod(methodName);
		
		logger.info("*****Starting TC001_AccountRegestrationTest*****");
		logger.debug("This is a debug log message");
		
		try {
			//HomePage
			HomePage hp = new HomePage(driver);
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("HomePage.jpg"), "Navigated to 'Tutorials Ninja' HomePage");
			logger.info("Navigated to HomePage");
			hp.clickMyAccountTab();
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("MyAccountTab.jpg"), "Clicked on 'My Account' Tab");
			hp.clickRegister();
			logger.info("Clicked on 'Register' Link");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("RegisterLink.jpg"), "Clicked on 'Register' Link");
			
			//AccountRegistrationPage
			AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
			regPage.setFirstName(randomString().toUpperCase());
			regPage.setLastName(randomString().toUpperCase());
			
			email = randomString()+"@gmail.com";
			regPage.setEmailRegPage(email);
			regPage.setTelephone(randomNumber());
			logger.info("Entering the Customer Registration Details 1");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("CustomerRegistrationDetails1.jpg"), "Entered 1st set of the Customer Registration Details");
			
			password = randomAlphaNumeric();
			regPage.setPasswordRegPage(password);
			regPage.setConfirmPassword(password);
			
			regPage.clkPolicyCheckBox();
			
			logger.info("Entering the Customer Registration Details 2");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("CustomerRegistrationDetails2.jpg"), "Entered 2nd set of Customer Registration Details");
			
			regPage.clickContinueBtn();
			logger.info("Enterd into Logged in page");
			
			String confmsg = regPage.getConfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation messge mismatch");
			test.addScreenCaptureFromPath(captureScreenshotWhileExecutingTheScript("AccountCreationConfirmationPage.jpg"), "Navigated to Account Creation Confirmation Page");

			logger.info("Test Passed");
			
			//After Account Registration is done. it's navigated to 'Logged-in Page' so to perform Logout activity below method is calling
			TC003_LogoutTest.verify_logout_test();
			
		} catch(Exception e) {
			logger.error("Test failed:  "+e.getMessage());
			Assert.fail("Test failed:  "+e.getMessage());
		} finally {
			logger.info("*****Finished TC001_AccountRegestrationTest*****");
		}
		
	}
}
