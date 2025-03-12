package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E32_Open_NewTab_using_JavascriptExecuter {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		try {
			//Open a new tab using Javascript Executor
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.open()"); //cmd to open new tab
			driver.findElement(By.xpath("//sss"));
			int i = 1; 
			for(String handle : driver.getWindowHandles()) { //driver.getWindowHandles() will return all the window corresponding id's in String format 
				//to print the corresponding window id's
				System.out.println("Handle "+i+":  "+handle);
				i++;
			}
			
			//switch to the newly opened tab (latest handle)
			driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString()); //index will start from '0'
			
			driver.get("https://www.bing.com");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}
}
