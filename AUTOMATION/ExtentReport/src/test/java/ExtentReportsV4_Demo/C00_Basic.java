package ExtentReportsV4_Demo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class C00_Basic {
	static WebDriver driver;
	// static ExtentHtmlReporter extenthtmlReporter;

	public static void main(String Args[]) throws IOException {
		ExtentReports extentreports = new ExtentReports();	// Reporter Engine
		//"report.html" ----- //ExtentSparkReporter("report.html") ----- String Instance 
		//file ----- ExtentSparkReporter(file) ----- file ----- file Instance
		File file = new File("report.html");		//(or) "F:\\SIMPLII\\SIMPLII_AUTOMATION\\AUTOMATION\\ExtentReport\\report.html"
		ExtentSparkReporter spartreporter = new ExtentSparkReporter("report.html");	//one of the reporter type in following Report types
//		ExtentAventReporter  pro
//		ExtentBDDReporter  pro
//		ExtentCardsReporter  pro
//		ExtentEmailReporter  pro
//		ExtentHtmlReporter (version-3) 
//		ExtentKlovReporter 
//		ExtentLoggerReporter 
//		ExtentTabularReporter  pro
		extentreports.attachReporter(spartreporter); //Here we are Engine to Reporter Type
		
		//Creating Tests
		//There r 5 diff Log levels - Fail, Skip, Warning, Pass & Info
		ExtentTest test1 = extentreports.createTest("TestCaseName 1"); //TestCase Name /If we dont mention anything by default TC status is Pass only
		test1.pass("This is PASS");	//log
		
		ExtentTest test2 = extentreports.createTest("TestCaseName 2"); //TestCase Name /If we dont mention anything by default TC status is Pass only
		test2.log(Status.FAIL, "This is FAIL");	//log
		
		//(or)
		extentreports.createTest("TestCaseName 3").skip("This is SKIP");
		
		
		
		extentreports.flush();	
		
		Desktop.getDesktop().browse(new File("report.html").toURI());		//To open Reports file Automatically from java
	}
}
