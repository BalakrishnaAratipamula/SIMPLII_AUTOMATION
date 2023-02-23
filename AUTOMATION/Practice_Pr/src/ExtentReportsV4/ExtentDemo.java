package ExtentReportsV4;

import java.io.File;
import java.io.IOException;
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
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeClass
	public void extentInfo() {
		//To specify file the location
		htmlReporter = new ExtentHtmlReporter("./TestResults\\ExtentReporter.html");
		//Title(Page Titile) of the Report
		htmlReporter.config().setDocumentTitle("/*************Automation Report***********/(setDocumentTitle)");
		//Name of the Report (or) Dashboard Header
		htmlReporter.config().setReportName("/************Functional Report**********/(setReportName)");
		//To specify Theme like STANDERD/DARK
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		//To create ExtentReports object and to attach Reports and to entry data in reports
		extent= new ExtentReports();
		//to attach Reports
		extent.attachReporter(htmlReporter);
		//to print data in report
		extent.setSystemInfo("---HostName--->", "(----LocalHost---)");//key or Name, value
		extent.setSystemInfo("---OS--->", "(----Windows10---)");
		extent.setSystemInfo("---Tester Name--->", "(----Balakrishna---)");
		extent.setSystemInfo("---Browser--->", "(----CHROME---)");
		
		//To create ExtentTest object and specify Title (or) Home page header
		test = extent.createTest("/-------OrangeHRM_TitleTest(createTest)-------/");//Which test
	}
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		test.log(Status.INFO, "/-----Chrome Browser launched-----/");//to pass user msg to extent report
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		test.log(Status.INFO, "-----Navigated Orange HRM Application-----");
	}
	@Test
	public void titleTest() throws IOException {
		String pgTitle=driver.getTitle();
		Assert.assertEquals("OrangeHRM", pgTitle, "@@@@@@@-Page Title not match-@@@@@@@");
		test.log(Status.PASS, "-------Expected title exist(PASS)-------");
		test.log(Status.FAIL, "-------Expected title Doesn't exist(FAIL)-------");// If test pass also this msg will print and show in red symbol
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//to get Date stamping with file
		Date dt= new Date();	//it will return system date
		String df1= new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss").format(dt);//to convert into required format
		//to save screenshot with date stamping
		FileHandler.copy(screenshot, new File("F:\\Screenshot_from_ExtentReport"+df1+".png"));  
		test.addScreenCaptureFromPath("F:\\Screenshot_from_ExtentReport"+df1+".png"); //To adding screenshot to extent report
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@AfterClass
	public void endReport(){
		extent.flush();
	}
	
}