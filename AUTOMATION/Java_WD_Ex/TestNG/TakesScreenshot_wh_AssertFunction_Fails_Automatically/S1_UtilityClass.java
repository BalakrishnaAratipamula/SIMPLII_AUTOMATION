package TakesScreenshot_wh_AssertFunction_Fails_Automatically;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class S1_UtilityClass {
	public void takeScreenshot(WebDriver driver, String fileName) {
		TakesScreenshot takesscreenshot = ((TakesScreenshot)driver);
		File sourceFile = takesscreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+"\\ScreenShot\\"+fileName+".png"));
		} catch(Exception e) {
			e.getMessage();
		}
		
	}
}
