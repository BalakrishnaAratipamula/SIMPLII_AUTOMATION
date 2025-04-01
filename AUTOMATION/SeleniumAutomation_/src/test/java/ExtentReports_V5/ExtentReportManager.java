package ExtentReports_V5;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	public ExtentSparkReporter sparkReporter; //one of the Report type
	public static ExtentReports extent;
	public static ExtentTest test;	//ExtentTest - is used to create the test
//	static RemoteWebDriver driver;
	String repName;

	public void onStart(ITestContext testContext) {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		repName = "Test-Report-" + timeStamp + ".html";
		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);// specify location of the report

		sparkReporter.config().setDocumentTitle("opencart Automation Report"); // Title of report
		sparkReporter.config().setReportName("opencart Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "opencart");
		extent.setSystemInfo("Module", "MyAccount");
		extent.setSystemInfo("Sub Module", "Register");
		extent.setSystemInfo("User Name", System.getProperty("user.name")); //System user name
		extent.setSystemInfo("Environemnt", "QA");
		
//		String os = testContext.getCurrentXmlTest().getParameter("OS");
//		extent.setSystemInfo("Operating System", os);
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("OS Version", System.getProperty("os.version"));
		
		
		//@@@onStart() will trigger at initial so that time Browser will not launch so null will get print. Bcz of this i'm getting the browser details after launching the browser
		String[] browserDetails = new BaseClass1().getBrowserDetails(); //both browserName & browserVersion returning from 'BaseClass1.getBrowserDetails()'
		
		extent.setSystemInfo("Browser Name", browserDetails[0]); //index will start from '0'
		extent.setSystemInfo("Browser Version", browserDetails[1]);

		
		List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
		if (!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups", includedGroups.toString());
		}
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups()); // to display groups in report
		test.log(Status.PASS, result.getName() + " got successfully executed");
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL, result.getName() + " got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		try {
			String imgPath = new BaseClass1().captureScreenshotForFailSkipEvent(result.getName());
			test.addScreenCaptureFromPath(imgPath);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.SKIP, result.getName() + " got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		try {
			String imgPath = new BaseClass1().captureScreenshotForFailSkipEvent(result.getName()); //result.getName() - return Test Name
			test.addScreenCaptureFromPath(imgPath);

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void onFinish(ITestContext testContext) {

		extent.flush();
		
		String pathOfExtentReport = System.getProperty("user.dir") + "\\reports\\" + repName;
		File extentReport = new File(pathOfExtentReport);

		try {
			Desktop.getDesktop().browse(extentReport.toURI()); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//getting Method Name To 'CreateTest' For Execution Time Screenshot and returning 'ExtentText' object to TestScript class
	public static ExtentTest gettingMethodNameToCreateTestForExecutionTimeScreenshot(String methodName) {
		test = extent.createTest(methodName);

		return test;
	}

}
