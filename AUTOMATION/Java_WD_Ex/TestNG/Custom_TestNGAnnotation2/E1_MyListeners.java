package Custom_TestNGAnnotation2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class E1_MyListeners implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is onTestStart");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is onTestSuccess");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is onTestFailure");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is onTestSkipped");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test is onTestFailedButWithinSuccessPercentage");
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test is onStart");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test is onFinish");
	}
}
