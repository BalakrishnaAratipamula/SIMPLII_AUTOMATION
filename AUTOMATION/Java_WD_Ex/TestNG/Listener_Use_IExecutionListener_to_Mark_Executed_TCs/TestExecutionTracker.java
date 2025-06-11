package Listener_Use_IExecutionListener_to_Mark_Executed_TCs;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestExecutionTracker implements ITestListener {
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

	private void logExecutedTest(ITestResult result) {
		String testName = result.getMethod().getQualifiedName();
		try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
			fw.write(testName + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
