package TakingScreenshotOnlyForFailedTestCases_UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class S2_TestNG_Listener_to_CaptureScreenshots_onFailure implements ITestListener {
	private WebDriver driver;
	
	@Override
	public void onTestFailure(ITestResult result) {
		Object testInstance = result.getInstance(); //getInstance() method is commonly used in the Singleton Design Pattern to ensure that only one instance of a class is created and shared throughout the application.
		try {
			driver = (WebDriver) testInstance.getClass().getDeclaredField("driver").get(testInstance);
			S1_ScreenshotUtility.captureScreenshot(driver, result.getName()); //getName() will return the currently executing 'method name' (TC name)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
