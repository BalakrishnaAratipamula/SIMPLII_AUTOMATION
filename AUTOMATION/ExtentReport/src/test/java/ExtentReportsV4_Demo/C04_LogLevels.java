package ExtentReportsV4_Demo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class C04_LogLevels {
	public static void main(String Args[]) throws IOException {
		ExtentReports extentreports = new ExtentReports(); // Reporter Engine
		File file = new File("report.html");
		ExtentSparkReporter spartreporter = new ExtentSparkReporter(file); 
		extentreports.attachReporter(spartreporter);

		// There r 5 diff Log levels - Fail, Skip, Warning, Pass & Info --- Overall TC status will reflect on hierarchy
		extentreports.createTest("TestCaseName 1")
		.log(Status.PASS, "This log is PASS")
		.log(Status.INFO, "This log is INFO")
		.log(Status.FAIL, "This log is FAIL")
		.log(Status.WARNING, "This log is WARNING")
		.log(Status.SKIP, "This log is SKIP")
		//(or)
		.pass("This is PASS")
		.info("This is INFO")
		.fail("This is FAIL")
		.warning("This is WARNING")
		.skip("This is SKIP");

		extentreports.flush();

		Desktop.getDesktop().browse(new File("report.html").toURI()); // To open Reports file Automatically from java
	}
}
