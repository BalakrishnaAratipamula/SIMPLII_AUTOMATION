package WD_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX28_AuotoIT {
	public static void main(String[] args) throws Exception{
		//To Initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.filemail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement ShareOption=driver.findElement(By.xpath("//span[contains(text(),'Share')]"));
		Thread.sleep(4000);

		Actions act= new Actions(driver);
		//to perform mouseHover operation
		act.moveToElement(ShareOption).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Upload File")).click();
		Thread.sleep(4000);

		driver.findElement(By.id("FilemailMessageToURL")).sendKeys("uploading file using selenium by Robot class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='addBtn']")).click();
		Thread.sleep(1000);

		//to call the autoIT script file (.exe file) into Eclipse using "Runtime" class
		Runtime.getRuntime().exec("F:\\AutoIT\\file.exe"); 	//.exec - AutoIT script executable file	
		////// solution for deprecated: https://stackoverflow.com/questions/21908645/command-in-runtime-getruntime-exec-not-working


		/*;focus on "File Name" edit box
		ControlFocus("Open","","Edit1")        //("title","text(leave it)","control ID((property of the window component along with instance)")
		;To enter file path					   /////Control ID (class+instance)	
		ControlSetText("Open","","Edit1","F:\dd.jpg") //("title","text(leave it)","control ID((property of the window component along with instance))","String(path of the Image with extension)"
		;to pause execution                       
		Sleep(5000)
		;to click on "Open" button
		ControlClick("Open","","Button1")*/


	}
}

//After completeting the script .au3 extension is require to Save As
