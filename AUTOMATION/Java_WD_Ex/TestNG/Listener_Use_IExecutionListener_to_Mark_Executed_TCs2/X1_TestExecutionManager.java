package Listener_Use_IExecutionListener_to_Mark_Executed_TCs2;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

// @.Suppose 400 test cases are running and after 150 test cases got executed the system got crashed or network was gone or application got crashed. How to run only the test cases which are not executed?
//N: If we are trying to execute remaining 150 not executed TCs through 'testng.xml' file we didn't able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
//N: If we are trying to execute remaining 150 not executed TCs through 'Test Class' file we can able to see the the Passed & Skipped count see in 'console' but we can see in 'Results of running class (i.e. TestNG result)'
public class X1_TestExecutionManager implements ITestListener {
	private static final String LOG_FILE = "executed_tests.txt";

	@Override
	public void onTestSuccess(ITestResult result) {
		logExecutedTest(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logExecutedTest(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logExecutedTest(result);
	}

	//to write execution TCs into Notepad
	private void logExecutedTest(ITestResult result) {
		String testName = result.getMethod().getQualifiedName();
		try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
			fw.write(testName + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
