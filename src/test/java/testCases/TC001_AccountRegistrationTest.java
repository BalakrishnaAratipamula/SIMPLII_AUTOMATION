package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC001_AccountRegistrationTest extends BaseClass {
	@Test(groups = { "Regression", "Master" })
	public void verify_account_registration() {
		//code to captureScreenshot while script is executing
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("MethodName: "+methodName );
		ExtentTest test = ExtentReportManager.captureScreenshotOnExecution(methodName);
		
		logger.info("***** Starting TC001_AccountRegistrationTest  *****");
		logger.debug("This is a debug log message");
		
		try {
			//HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link.. ");
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshot("MyAccountLinkDD.jpg"), "Clicked on MyAccount Link");
//			//test.addScreenCaptureFromPath(new BaseClass().captureScreen(methodName));
			
			hp.clickRegister();
			logger.info("Clicked on Register Link.. ");

			//AccountRegistrationPage
			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			logger.info("Providing customer details...");
			regpage.setFirstName(randomeString().toUpperCase());
			regpage.setLastName(randomeString().toUpperCase());
			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email
			regpage.setTelephone(randomeNumber());

			String password = randomeAlphaNumberic();

			regpage.setPassword(password);
			regpage.setConfirmPassword(password);

			regpage.setPrivacyPolicy();
			//To captureScreenshot when script is executing
			test.addScreenCaptureFromPath(captureScreenshot("CustomerRegistrationDetails.jpg"), "Customer registration details enterd");
//			//test.addScreenCaptureFromPath(new BaseClass().captureScreen(methodName));
			regpage.clickContinue();

			logger.info("Validating expected message..");

			String confmsg = regpage.getConfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");

			logger.info("Test passed");
		} catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		} finally {
			logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}

	}

}
