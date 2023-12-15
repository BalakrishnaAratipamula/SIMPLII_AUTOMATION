package ExtentReportsV4_Demo;

import static org.testng.Assert.fail;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class C06_AddScreenshotToReport {

	public static WebDriver driver;

	public static void main(String Args[]) throws IOException {
		ExtentReports extentreports = new ExtentReports(); // Reporter Engine
		File file = new File("report.html");
		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(spartreporter);

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//------------ TEST LEVEL ------------//
		
		String getBase64Code = captureScreenshot(); // It will get the base64Code
		String path = captureScreenshot("Google.jpg"); // Pass the Screenshot Name (or) extension in below method

		// 1
		extentreports.createTest("TestCaseName 1", "This is TEST LEVEL Description") // (TC_Name, Description)
		.info("This is Info message 1")
		.addScreenCaptureFromBase64String(getBase64Code);
		// 2
		extentreports.createTest("TestCaseName 2", "This is TEST LEVEL Description")
		.info("This is Info message 2")
		.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage"); // (imageSouurce, imageTitle)
		// 2a
		extentreports.createTest("TestCaseName 2a", "This is TEST LEVEL Description")
		.info("This is Info message 2a")
		.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage #1") // Taking multiple Screenshots
		.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage #2") // 
		.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage #3") // 
		.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage #4") // 
		.addScreenCaptureFromBase64String(getBase64Code, "Google Homepage #5"); // 
		// 3
		extentreports.createTest("TestCaseName 3", "This is TEST LEVEL Description") // (TC_Name, Description)
		.info("This is Info message 3")
		.addScreenCaptureFromPath(path);
		// 4
		extentreports.createTest("TestCaseName 4", "This is TEST LEVEL Description")
		.info("This is Info message 4")
		.addScreenCaptureFromPath(path, "Google Homepage"); // (imageSouurce, imageTitle)
		// 4a
		extentreports.createTest("TestCaseName 4a", "This is TEST LEVEL Description")
		.info("This is Info message 4a")
		.addScreenCaptureFromPath(path, "Google Homepage #1") //Taking multiple Screenshots
		.addScreenCaptureFromPath(path, "Google Homepage #2") //
		.addScreenCaptureFromPath(path, "Google Homepage #3") //
		.addScreenCaptureFromPath(path, "Google Homepage #4") //
		.addScreenCaptureFromPath(path, "Google Homepage #5"); //
		
		//--------- LOG LEVEL ------------//
		Throwable t = new Throwable("Exception Custom message"); //This is for fai(throwable_instace, ScreenshotInfo)
		
		extentreports.createTest("TestCaseName 5", "This is LOG LEVEL Description")
		.info("This is Info message 5")
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Code).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Code, "Google Homepage #1").build())
		.fail("This is Info msg #1", MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Code, "Google Homepage #2").build())
		.fail(t, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Code, "Google Homepage #3").build());    // t - Throwable Instance
		
		extentreports.createTest("TestCaseName 6", "This is LOG LEVEL Description")
		.info("This is Info message 5")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build())
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path, "Google Homepage #1").build())
		.fail("This is Info msg #1", MediaEntityBuilder.createScreenCaptureFromPath(path, "Google Homepage #2").build())
		.fail(t, MediaEntityBuilder.createScreenCaptureFromPath(path, "Google Homepage #3").build());    // t - Throwable Instance
		
		extentreports.flush();
		driver.quit();

		Desktop.getDesktop().browse(new File("report.html").toURI()); // To open Reports file Automatically from java
	}

	// Capturing Screenshot

	// 1. To capture screenshot and store it in Local machine
	public static String captureScreenshot(String fileName) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot - To capture screenshot and store it in Local machine");
		return destFile.getAbsolutePath();
	}

	// 2. To return Base64 image
	public static String captureScreenshot() {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot - Base64 image Returned");
		return base64Code;
	}
	
}
