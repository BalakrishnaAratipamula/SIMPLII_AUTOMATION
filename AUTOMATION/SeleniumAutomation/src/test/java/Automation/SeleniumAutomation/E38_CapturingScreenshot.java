package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class E38_CapturingScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to capture Screenshot of page (current focusing window page only capture)
		File myFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\ScreenshotFromEclipse\\screenshot1.png"); //(Or) ./Screenshot\\screenshot1.png ./ -  represents inside the project location screenshot will store
		
		//to save the file in specified location
		FileHandler.copy(myFile, destination);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
