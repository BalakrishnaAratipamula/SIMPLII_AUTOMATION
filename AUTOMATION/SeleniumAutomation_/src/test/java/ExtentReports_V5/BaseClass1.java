package ExtentReports_V5;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class BaseClass1 {
	public static WebDriver driver;
	
	//1. captureScreen - for Fail & Skip event
	public String captureScreenshotForFailSkipEvent(String tname) throws IOException{
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesscreenshot = (TakesScreenshot)driver;
		File sourceFile = takesscreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir")+"\\Screenshots"+tname+"_"+timeStamp+".png";	//System.getProperty("user.dir") - will return the user directory
		File targetFile = new File(targetFilePath);
		
		sourceFile.renameTo(targetFile); //overriding the name
		
		return targetFilePath;
	}
	
	
	
	//2. captureScreenshotOnExecution - Capture screenshot while executing the script
	public String captureScreenshotWhileExecutingTheScript(String methodName){
		TakesScreenshot takesscreenshot = (TakesScreenshot)driver;
		File sourceFile = takesscreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots"+methodName);
		
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot stored in local machine");
		
		return destFile.getAbsolutePath(); //getAbsolutePath() - will return the whole path
	}
	
	@AfterClass
	public void tesrDown() throws InterruptedException {
		if(driver!=null) {
			Thread.sleep(3000);
			driver.quit();
		}
	}
	
	public String[] getBrowserDetails() {
		//initializing the browser
		driver = new ChromeDriver();
		
		Capabilities browserCap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = browserCap.getBrowserName();
		String browserVersion = browserCap.getBrowserVersion();
		String[] browserDetails = {browserName, browserVersion};
		System.out.println(browserName);
		System.out.println(browserVersion);
		return browserDetails;
	}
	
}
