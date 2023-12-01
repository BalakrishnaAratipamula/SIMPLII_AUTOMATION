package sample.pack;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
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

public class ExtentDemo {

	ExtentHtmlReporter extenthtmlReporter;
	ExtentReports extentreports;
	ExtentTest extenttest;
	WebDriver driver;

	@BeforeClass
	public void extentInfo() {
		//to specify the file location
		extenthtmlReporter = new ExtentHtmlReporter("./TestResults//ExtentReporter.html");																//  															./-means current working folder
		//Title of the Report
		extenthtmlReporter.config().setDocumentTitle("/*******Title of the Report*******/");
		//Name of the Report
		extenthtmlReporter.config().setReportName("/*******Name of the Report*******/");
		//To Specify Theme like STANDARD/DARK
		extenthtmlReporter.config().setTheme(Theme.STANDARD); 


		//To create ExtentReports object and to attach Reports and to entry data in reports
		extentreports = new ExtentReports();
		//to attach Reports
		extentreports.attachReporter(extenthtmlReporter);
		//to print data in report
		extentreports.setSystemInfo("Hostname", "LocalHost");//key, value
		extentreports.setSystemInfo("OS", "Windows10");
		extentreports.setSystemInfo("Tester Name", "Balakrishna");
		extentreports.setSystemInfo("Browser", "Chrome");

		//To create ExtentTest object and specify Report Title
		extenttest = extentreports.createTest("OrangeHRM_TitleTest"); //which test
	}
	@BeforeMethod
	public void setUp(){
		// System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		extenttest.log(Status.INFO,"Chrome browser launched");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");//https://opensource-demo.orangehrmlive.com/
		extenttest.log(Status.INFO,"Navigated Orange HRM Application");
	}

	@Test
	public void titleTest() throws IOException {
		String pgTitle = driver.getTitle();
		Assert.assertEquals("OrangeHRM", pgTitle);
		extenttest.log(Status.PASS, "Expected title exist");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//to get Date stamping with file
		Date dt= new Date();	//it will return system date
		DateFormat df1= new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss");//to convert into required format

		//to save screenshot with date stamping
		FileHandler.copy(file,new File("F:\\titleScreenshot"+df1.format(dt)+".png"))  ;
		extenttest.addScreenCaptureFromPath("F:\\titleScreenshot"+df1.format(dt)+".png");// adding screen shot
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@AfterClass
	public void endReport(){
		extentreports.flush();
	}
}