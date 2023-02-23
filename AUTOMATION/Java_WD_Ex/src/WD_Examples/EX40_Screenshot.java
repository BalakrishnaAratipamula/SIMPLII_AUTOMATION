package WD_Examples;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EX40_Screenshot {
	public static void main(String[] args) throws Exception{
		// To initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://en-gb.facebook.com");

		//to capture screenshot of page
		File myFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\screenshots from eclipse\\screenshot11.png");
		//to save file in specified location
		FileHandler.copy(myFile,destination);

		//to save image file in Defects folder under java project
		//FileHandler.copy(myFile,new File("F:\\LT eclipse-workspace\\Java_project\\Defects\\screenshot.png"));	//shortcut to path "./Defects\\screenshot2.png"

		driver.quit();
	}
}
