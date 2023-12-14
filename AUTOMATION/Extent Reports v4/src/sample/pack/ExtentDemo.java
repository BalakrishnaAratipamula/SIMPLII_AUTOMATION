package sample.pack;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType; //
import org.openqa.selenium.TakesScreenshot; //
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler; //
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemo {

	ExtentHtmlReporter extenthtmlReporter;
	ExtentReports extentreports;
	ExtentTest extenttest;
	WebDriver driver;

	@BeforeClass
	public void extentInfo() {
		// to specify the file location
		extenthtmlReporter = new ExtentHtmlReporter("./TestResults//ExtentReporter.html"); // ./-means current working
																							// folder
		// Title of the Report
		extenthtmlReporter.config().setDocumentTitle("/*******Title of the Report*******/");
		// Name of the Report
		extenthtmlReporter.config().setReportName("/*******Name of the Report*******/");
		// To Specify Theme like STANDARD/DARK
		extenthtmlReporter.config().setTheme(Theme.STANDARD);

		// To create ExtentReports object and to attach Reports and to entry data in reports
		extentreports = new ExtentReports();
		// to attach Reports
		extentreports.attachReporter(extenthtmlReporter);
		// to print data in report
		extentreports.setSystemInfo("Hostname", "LocalHost");// key, value
		extentreports.setSystemInfo("OS", "Windows10");
		extentreports.setSystemInfo("Tester Name", "Balakrishna");
		extentreports.setSystemInfo("Browser", "Chrome");

		/// To create ExtentTest object and specify Report Title
		extenttest = extentreports.createTest("OrangeHRM_TitleTest"); // which test
	}

	@BeforeMethod
	public void setUp() throws IOException {
		// System.setProperty("webdriver.chrome.driver",
		// "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//	    driver = new FirefoxDriver();

		extenttest.log(Status.INFO, "Chrome browser launched");
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/"); // https://opensource-demo.orangehrmlive.com/
		File myFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File myFile = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\screenshots from eclipse\\BeforeExtentReport_screenshot1.png");
		FileHandler.copy(myFile, destination);
		extenttest.log(Status.INFO, "Navigated Orange HRM Application");
	}

	@Test
	public void titleTest() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(4000);
		File myFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\screenshots from eclipse\\screenshot2.png");
		FileHandler.copy(myFile2, destination);
		String pgTitle = driver.getTitle();
		Assert.assertEquals("Logged In Successfully | Practice Test Automation", pgTitle);
		extenttest.log(Status.PASS, "Expected title exist");

		// To capture screenshot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	//Selenium 3

		// to get Date stamping with file
		Date dt = new Date(); // it will return system date
		DateFormat df1 = new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss");// to convert into required format
		// to save screenshot with date stamping
		FileUtils.copyFile(file, new File("F:\\titleScreenshot101"+ df1.format(dt) +".png")); 
		extenttest.addScreenCaptureFromPath("F:\\titleScreenshot102"+ df1.format(dt) +".png");// adding screen shot //
		extenttest.log(Status.INFO, "ScreenShot Taken");
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		extenttest.log(Status.INFO, "Browser Closed");
	}

	@AfterClass
	public void endReport() {
		extentreports.flush();
	}
}