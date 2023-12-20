package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Utility {

	public static WebDriver driver;	//In-case 'driver' is not static we will get NullPointerException like - Cannot invoke "org.openqa.selenium.TakesScreenshot.getScreenshotAs(org.openqa.selenium.OutputType)" because "takesScreenshot" is null
	//Refer for above NullPointerException - https://www.youtube.com/watch?v=z3OmQ_wqnVU
	//Some times null pointer exception will come due to 'driver' initialization issue - it will check by using below printing msg
	//System.out.println("driver="+driver); //to check whether we are accessing 'driver' properly or not
	static ExtentReports extentreports = new ExtentReports(); // Reporter Engine
	static File file = new File("report.html");
	static ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
	static ExtentTest test1 = extentreports.createTest("TestCaseName 1", "TestCase Description");

	public static void getExtentReport(String msg, String path, String Desc) {
//		String str1 = StepDefintions.captureScreenshot(path);
//		ExtentReports extentreports = new ExtentReports(); // Reporter Engine
//		File file = new File("report.html");
//		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(spartreporter);

//		ExtentTest test1 = extentreports.createTest("TestCaseName 1", "TestCase Description");
		test1.info(msg);
		test1.addScreenCaptureFromBase64String(captureScreenshot(), Desc);
		test1.addScreenCaptureFromPath(captureScreenshot(path), Desc);
		
		extentreports.flush();
	}

	// Capturing Screenshot

	// 1. 'for file path' - To capture screenshot and store it in Local machine
	public static String captureScreenshot(String fileName) {
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot - To capture screenshot and store it in Local machine");
		return destFile.getAbsolutePath();
	}

	// 2. 'for Base64Code' - To return Base64 image
	public static String captureScreenshot() {
		System.out.println("driver="+driver); //to check whether we are accessing 'driver' properly or not
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64Code = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot - Base64 image Returned");
		return base64Code;
	}

}
