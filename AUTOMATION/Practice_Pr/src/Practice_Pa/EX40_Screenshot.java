package Practice_Pa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class EX40_Screenshot {
public static void main(String[] args) throws Exception {
	// To initialize browser
	System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	
	//to capture screenshot of page
	File myFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//FILE---which we require(we require file)
	
	//to save file in a specified location
	//FileHandler.copy(myFile,new File("F:\\Screenshot123.png"));//F:\LT eclipse-workspace\Practice_Pr\Defects
	//to save image file in defect folder under java project
	FileHandler.copy(myFile,new File("./Defects\\Screenshot1234.png"));
	//FileHandler.copy(myFile,new File(".\\Defects\\Screenshot1234.png"));
	
}
}
