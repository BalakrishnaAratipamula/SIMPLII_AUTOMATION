package Automation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E40_Capture_WebElementScreenshot {
	static int i =1;
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1.Mic Screenshot
		WebElement ele = driver.findElement(By.xpath("//*[local-name()='svg' and @class='goxjub']")); //XPath to handle svg elements
		webElementScreenshot(ele); 
		
		//2.Cam Screenshot
		WebElement ele2 = driver.findElement(By.xpath("//*[local-name()='svg' and @class='Gdd5U']")); // XPath to handle
		webElementScreenshot(ele2);

		//3.Search symbol screenshot 
		WebElement ele3 = driver.findElement(By.xpath("(//*[local-name()='svg' and @focusable='false'])[3]")); // XPath to handle
		webElementScreenshot(ele3); 
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	// Generic method to handle WebElement Screenshot
	public static void webElementScreenshot(WebElement ele) {
		File myFile = ele.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(myFile, new File("./Screenshot\\webElementScreenshot"+i+++".jpg"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
