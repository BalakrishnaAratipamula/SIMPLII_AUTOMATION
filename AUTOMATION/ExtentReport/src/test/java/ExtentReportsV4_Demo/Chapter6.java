package ExtentReportsV4_Demo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chapter6 {
	static WebDriver driver;
	// static ExtentHtmlReporter extenthtmlReporter;

	public static void main(String Args[]) throws IOException {
		// to specify the file location
//		extenthtmlReporter = new ExtentHtmlReporter("./TestResults//ExtentReporter2.html");
		ExtentReports extentreports = new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/"); // https://opensource-demo.orangehrmlive.com/

		String base64code = captureScreenshot();
		String path = captureScreenshot("Google.jpg");

		extentreports
			.createTest("Screenshot Test 1", "This is for attaching the screenshot to the test at Test level")
			.info("This is a info msg")
			.addScreenCaptureFromBase64String(base64code);

		extentreports
			.createTest("Screenshot Test 2", "This is for attaching the screenshot to the test at Test level")
			.info("This is a info msg")
			.addScreenCaptureFromBase64String(base64code, "Google HomePage");
		
		extentreports
			.createTest("Screenshot Test 2", "This is for attaching the screenshot to the test at Test level")
			.info("This is a info msg")
			.addScreenCaptureFromPath(path);

		extentreports
			.createTest("Screenshot Test 2", "This is for attaching the screenshot to the test at Test level")
			.info("This is a info msg")
			.addScreenCaptureFromPath(path, "Google HomePage");


		extentreports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		driver.close();
	}

	public static String captureScreenshot() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot saved Successfully");
		return base64Code;
	}

	public static String captureScreenshot(String fileName) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshot/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved Successfully");
		return destFile.getAbsolutePath();
	}

}
