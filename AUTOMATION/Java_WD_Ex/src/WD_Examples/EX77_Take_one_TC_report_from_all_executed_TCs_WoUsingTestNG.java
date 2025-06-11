package WD_Examples;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// @.I want to take one TC report from all the executed TCs. H can we get it 'without using TestNG'?
//Ans: Use plain Java to run your Selenium tests.
public class EX77_Take_one_TC_report_from_all_executed_TCs_WoUsingTestNG {
	public static void main(String[] args) {
        WebDriver driver = null;
        String reportPath = "SingleTestCaseReport.html";
        String testCaseName = "TC_LoginTest"; // only report this test case
        boolean testResult = false;

        try {
            driver = new ChromeDriver();
            driver.get("https://google.com");

            // Simulate test logic
            testResult = performLoginTest(driver);
            System.out.println("Code execution completed inside try block");

        } catch (Exception e) {
        	System.out.println("Entered inside catch block");
//            testResult = false;
        } finally {
            if (driver != null) 
            	driver.quit();
        }

        // Write result to report
        writeCustomReport(reportPath, testCaseName, testResult);
    }

    public static boolean performLoginTest(WebDriver driver) {
        // Simulate test logic
        System.out.println("Running login test...");
        return false; // You can change this based on test outcome
    }

    public static void writeCustomReport(String reportPath, String testCaseName, boolean testResult) {
        try (FileWriter writer = new FileWriter(reportPath)) {
            writer.write("<html><body>");
            writer.write("<h2>Custom Test Case Report</h2>");
            writer.write("<table border='1'><tr><th>Test Case</th><th>Status</th></tr>");
            writer.write("<tr><td>" + testCaseName + "</td><td>" + (testResult ? "PASSED" : "FAILED") + "</td></tr>");
            writer.write("</table></body></html>");
            System.out.println("Report generated: " + reportPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
