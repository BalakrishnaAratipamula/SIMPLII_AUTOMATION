package WD_Examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class EX40f_TakeScreenshots_onFailure_nd_GenerateVisualReport { //Just codes 
	static WebDriver driver;
	
	public void fullPageScreenshot_() throws IOException{
		//Take full page Screenshot
		File fullPageScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullPageScreenshot, new File("./screenshots/fullPageScreenshotTest_"+System.currentTimeMillis()+".png"));
	}
	
	public void elementScreenshot_() throws IOException {
		WebElement ele = driver.findElement(By.name(""));
		//Take element Screenshot (WebDriver 4x)
		File elementScreenshot = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(elementScreenshot, new File("./screenshots/elementScreenshotTest_"+System.currentTimeMillis()+".png"));
	}
	
	// Screenshot on Failure
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if(ITestResult.FAILURE == result.getStatus()) {
			File screenshotOnFailure = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotOnFailure, new File("./screenshots/screenshotOnFailureTest_"+System.currentTimeMillis()+" _ "+result.getName()+".png"));
		}
	}
	
	/*/For visual reports integarte with Extent Report
	  extent.attachFile(screenshotPath);
	  extent.attachBase64String((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64)); //*/
}
