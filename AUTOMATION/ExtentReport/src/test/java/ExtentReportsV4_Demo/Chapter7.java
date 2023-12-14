package ExtentReportsV4_Demo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter7 {
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
		
		extentreports.attachReporter(spartreporter);	//Here we are Engine to Reporter Type
		
		extentreports.flush();	
		
		Desktop.getDesktop().browse(new File("report.html").toURI());		//To open Reports file Automatically from java
//		driver.close();
	}
}
