package WD_Examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX41e_DrawBorderToElement_nd_CaptureElementScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.linkText("Images"));

		Thread.sleep(2000);
		//To border WE (or) Highlight element
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border = '3px solid red'", ele);
		Thread.sleep(2000);
		
		//To capture WebElement screenshot of WE
		File myFile = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myFile, new File("./borderWebElement.jpg"));

		driver.quit();
	}
}
