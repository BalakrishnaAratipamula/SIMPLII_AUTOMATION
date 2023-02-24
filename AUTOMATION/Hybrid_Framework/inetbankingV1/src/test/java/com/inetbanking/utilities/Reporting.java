package com.inetbanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter { //////Listener class used to generate Extent reports
	public ExtentHtmlReporter extenthtmlReporter;
	public ExtentReports extentreports;
	public ExtentTest extenttest;

	public void onStart(ITestContext testContext) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		String reportName = "Test-Report-" + timeStamp + ".html";

		extenthtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + reportName);//specify location of the report
		extenthtmlReporter.config().setDocumentTitle("InetBanking Test Project"); // Tile of report
		extenthtmlReporter.config().setReportName("Functional Test Automation Report"); // name of the report
		extenthtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); // location of the chart
		extenthtmlReporter.config().setTheme(Theme.DARK);
		
		extenthtmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml"); //this is for Lisnerclass

		extentreports = new ExtentReports();
		extentreports.attachReporter(extenthtmlReporter);
		extentreports.setSystemInfo("Host name", "localhost");
		extentreports.setSystemInfo("Environemnt", "QA");
		extentreports.setSystemInfo("user", "Balakrishna");

	}

	public void onTestSuccess(ITestResult itestresult) { //itestresult --- object of ITestResult //////tr.getName() - to get name of the TC
		extenttest = extentreports.createTest(itestresult.getName()); // create new entry in th report
		extenttest.log(Status.PASS, MarkupHelper.createLabel(itestresult.getName(), ExtentColor.GREEN)); //send the passed information to the report with GREEN color highlighted
																							
	}

	public void onTestFailure(ITestResult itestresult) { //it is just take screenshot
		extenttest = extentreports.createTest(itestresult.getName()); // create new entry in th report
		extenttest.log(Status.FAIL, MarkupHelper.createLabel(itestresult.getName(), ExtentColor.RED)); // send the passed information to the report with GREEN color highlighted

		String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + itestresult.getName() + ".png";

		File f = new File(screenshotPath);

		if (f.exists()) {
			try {
				extenttest.fail("Screenshot is below:" + extenttest.addScreenCaptureFromPath(screenshotPath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void onTestSkipped(ITestResult tr) {
		extenttest = extentreports.createTest(tr.getName()); // create new entry in th report
		extenttest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}

	public void onFinish(ITestContext testContext) {
		extentreports.flush();
	}
}
