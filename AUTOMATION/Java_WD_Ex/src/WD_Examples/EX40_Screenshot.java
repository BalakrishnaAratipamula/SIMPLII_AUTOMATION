package WD_Examples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX40_Screenshot {
	public static void main(String[] args) throws Exception{
		// To initialize browser
		WebDriver driver= new ChromeDriver();
		driver.get("http://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		/*/to capture screenshot of page
		File sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\screenshots from eclipse\\screenshot.png"); //"./Screenshots\\screenshot1.png"
		Thread.sleep(6000);
		//to save file in specified location
		FileHandler.copy(sourceFile,destination);

		//to save image file in Defects folder under java project
		//FileHandler.copy(myFile,new File("F:\\screenshots from eclipse\\screenshot1.png"));	//shortcut to path "./Defects\\screenshot2.png"
		//*/
		
		// 
		try {
            File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destFile=new File("./screenshots from eclipse/test_"+System.currentTimeMillis()+".png");
            FileUtils.copyFile(sourceFile, destFile);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions if needed
        } //*/
		
		driver.quit();
	}
}
