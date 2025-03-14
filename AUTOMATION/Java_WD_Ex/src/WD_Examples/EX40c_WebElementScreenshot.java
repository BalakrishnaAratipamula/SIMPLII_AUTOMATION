package WD_Examples;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX40c_WebElementScreenshot {
	public static int i = 1;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.facebook.com/"); 
		driver.navigate().to("https://www.google.com/"); //for SVG elements 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		WebElement ele = driver.findElement(By.xpath("//*[@name='login']"));
		//1.mic screenshot
		WebElement ele = driver.findElement(By.xpath("//*[local-name()='svg' and @class='goxjub']")); //for SVG elements
		webElementScreenshot(ele);
		//2.cam screenshot
		WebElement ele2 = driver.findElement(By.xpath("//*[local-name()='svg' and @class='Gdd5U']")); //for SVG elements
		webElementScreenshot(ele2);
		//3.search symbol screenshot
		WebElement ele3 = driver.findElement(By.xpath("(//*[local-name()='svg' and @focusable='false'])[3]")); //for SVG elements
		webElementScreenshot(ele3);
		
		//=============see Result in folder explorer then only image will visible
		driver.quit();
		
	}
	
	public static void webElementScreenshot(WebElement ele) throws InterruptedException{
		File myFile = ele.getScreenshotAs(OutputType.FILE);
		try { //=============see Result in folder explorer then only image will visible
			FileUtils.copyFile(myFile, new File("./webElementScreenshot"+i+++".jpg")); //.png
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
