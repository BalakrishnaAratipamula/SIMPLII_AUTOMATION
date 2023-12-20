package stepDefinitions;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.ITestResult;

/*import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
*/
public class StepDefintions extends Utility{

	// public static WebDriver driver;
//	static ExtentReports extentreports = new ExtentReports(); // Reporter Engine
//	static File file = new File("report.html");
//	static ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
//	static ExtentTest test1 = extentreports.createTest("TestCaseName 1", "TestCase Description");
//	public static Base base;
//	ExtentReports report = ExtenReportGenerator.getExtentReport();
//	ExtentTest test1; 
//	ITestResult result;
//	public void setUp() {
////		String testName = result.getName();
//		test1 = report.createTest("TestCase_1");
//		test1.info("Info msg");
//	}

//	public static void getExtentReport(String msg, String path, String Desc) {
////		ExtentReports extentreports = new ExtentReports(); // Reporter Engine
////		File file = new File("report.html");
////		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file);
//		extentreports.attachReporter(spartreporter);
//
////		ExtentTest test1 = extentreports.createTest("TestCaseName 1", "TestCase Description");
//		test1.info(msg);
//		test1.addScreenCaptureFromBase64String(captureScreenshot(), Desc);
//		test1.addScreenCaptureFromPath(captureScreenshot(path), Desc);
//		
//		extentreports.flush();
//	}

	@Given("^User is already on Open HRMS application$")
	public void user_is_already_on_Open_HRMS_application() throws Throwable {
		// System.setProperty("webdriver.edge.driver", "E:\\Drivers\\msedgedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // https://www.google.co.in/
		driver.get("https://www.google.co.in/");
		getExtentReport("Message 1", "Google1.jpg", "Description 1");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
	}

	@When("^Enter Registered user name and Password$")
	public void enter_Registered_user_name_and_Password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		getExtentReport("Message 2", "Google2.jpg", "Description 2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

//	@When("^Enter Registered userName as \"([^\"]*)\" and passWord as \"([^\"]*)\"$")
//	public void enter_Registered_userName_as_and_passWord_as(String username, String password) throws Throwable {
//		System.out.println(username + "   " + password);
//		driver.findElement(By.name("username")).clear();
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//	}

//	@When("^Enter Registered userName and passWord")
//	public void Enter_Registered_userName_and_passWord(DataTable dataTable) throws Throwable {
//		List<List<String>> data = dataTable.cells();
//		// System.out.println(username + " " + password);
//		driver.findElement(By.name("username")).clear();
//		driver.findElement(By.name("username")).sendKeys(data.get(1).get(0));
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys(data.get(1).get(1));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.name("username")).clear();
//		driver.findElement(By.name("username")).sendKeys(data.get(2).get(0));
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys(data.get(2).get(1));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.name("username")).clear();
//		driver.findElement(By.name("username")).sendKeys(data.get(3).get(0));
//		driver.findElement(By.name("password")).clear();
//		driver.findElement(By.name("password")).sendKeys(data.get(3).get(1));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
//	}

	/*
	 * System.out.println(username + "   " + password);
	 * driver.findElement(By.name("username")).clear();
	 * driver.findElement(By.name("username")).sendKeys(username);
	 * driver.findElement(By.name("password")).clear();
	 * driver.findElement(By.name("password")).sendKeys(password);
	 * driver.findElement(By.xpath("//button[@type='submit']")).click();
	 * Thread.sleep(5000);
	 */

	@Then("Home page should be shown$")
	public void login_page_should_be_shown() throws Throwable {

		String actual_Homepage_URL = driver.getCurrentUrl();
		String expected_Homepage_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		if (actual_Homepage_URL.equalsIgnoreCase(expected_Homepage_URL)) {
			System.out.println("test is passed");
		} else {
			System.out.println("test is failed");
		}

	}

	@When("^Browser is close$")
	public void Browser_is_close() throws Throwable {
//		String testName = result.getName();
//		extenReporterFunctionTC1("------Msg from StepDefinition-------");	//.info("------Msg from StepDefinition-------");
		// extenReporterFunctionTC1().addScreenCaptureFromBase64String(captureScreenshot(),
		// "URL 1 is Opened");
//		ExtentReports extentreports = new ExtentReports();
//		extentreports.flush();
//		driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		test1.info("------Msg from StepDefinition-------");
//		test1.addScreenCaptureFromPath(captureScreenshot());
		getExtentReport("Message 3", "Google3.jpg", "Description 3");
		driver.quit();
		Desktop.getDesktop().browse(new File("report.html").toURI()); // To open Reports file Automatically from java
	}

//	// Capturing Screenshot
//
//	// 1. 'for file path' - To capture screenshot and store it in Local machine
//	public static String captureScreenshot(String fileName) {
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./Screenshots/" + fileName);
//		try {
//			FileUtils.copyFile(sourceFile, destFile);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Screenshot - To capture screenshot and store it in Local machine");
//		return destFile.getAbsolutePath();
//	}
//
//	// 2. 'for Base64Code' - To return Base64 image
//	public static String captureScreenshot() {
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		String base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
//		System.out.println("Screenshot - Base64 image Returned");
//		return base64Code;
//	}

}

// https://paytm.com/