package WD_Examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class EX40e_Screenshot_onFailure {
	
	WebDriver driver;
	 
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			File screenshotOnFailure = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
				FileUtils.copyFile(screenshotOnFailure, new File("./screenshots/failure_"+result.getName()+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
/*/For visual reports integarte with Extent Report
   extent.attachFile(screenshotPath);
   extent.attachBase64String((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64)); //*/
