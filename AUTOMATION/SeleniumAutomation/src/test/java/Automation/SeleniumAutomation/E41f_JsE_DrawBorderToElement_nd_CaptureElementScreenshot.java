package Automation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E41f_JsE_DrawBorderToElement_nd_CaptureElementScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Images link
		WebElement ele = driver.findElement(By.linkText("Images"));
		
		//to border
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border = '3px solid red'", ele);
		
		//to capture WebElement Screenshot
		File myFile = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myFile, new File("./borderWebElement.jpg"));
		
		Thread.sleep(6000);
		driver.quit();
	}
}
