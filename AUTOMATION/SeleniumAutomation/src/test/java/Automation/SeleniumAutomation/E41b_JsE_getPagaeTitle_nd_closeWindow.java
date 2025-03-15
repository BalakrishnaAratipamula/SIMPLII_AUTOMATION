package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E41b_JsE_getPagaeTitle_nd_closeWindow {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//to open URL
		jse.executeScript("window.location='https://login.salesforce.com/'");
		
		//to getPageTitle
		String pageTitle = (String) jse.executeScript("return document.title");
		System.out.println("Page Title:  "+pageTitle);
		
		//to close browser window
		jse.executeScript("window.close");
	}
}
