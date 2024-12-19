package testCases;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.ExtentReportManager;

public class TC001_AccountRegistrationTest extends BaseClass {
/*/
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;

	String repName; */
	
	@Test(groups = { "Regression", "Master" })
	public void verify_account_registration() {
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		ExtentTest test = ExtentReportManager.captureScreenshotOnExecution(methodName);
		
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
		
		/*/
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		repName = "Test-Report-" + timeStamp + ".html";
		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);// specify location of the report

		sparkReporter.config().setDocumentTitle("opencart Automation Report"); // Title of report
		sparkReporter.config().setReportName("opencart Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		test = extent.createTest("TestCaseName 1", "TestCase Description"); // (TC_Name, Description)
		*/
		try {
//			ExtentReportManager.test = ExtentReportManager.extent.createTest("Sample Test");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link.. ");
//			test.addScreenCaptureFromPath(captureScreenshot("Google.jpg"), "Clicked on MyAccount Link");
			test.addScreenCaptureFromPath(new BaseClass().captureScreen(methodName));
			hp.clickRegister();
			logger.info("Clicked on Register Link.. ");

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
//			test.addScreenCaptureFromPath(captureScreenshot("Google2.jpg"), "Clicked on MyAccount Link");
			test.addScreenCaptureFromPath(new BaseClass().captureScreen(methodName));
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

//		extent.flush();
	}

}
