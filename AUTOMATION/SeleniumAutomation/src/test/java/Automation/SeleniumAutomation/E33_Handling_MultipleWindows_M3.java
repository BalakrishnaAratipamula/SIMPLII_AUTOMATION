package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E33_Handling_MultipleWindows_M3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// get 1st window Page title
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id:  " + parent); // parent
		System.out.println("Parent window Page title:  " + driver.getTitle());

		// click on 'Click this link to start new Tab'
		driver.findElement(By.linkText("Click this link to start new Tab")).click();
		
		// To read window handles
		Set<String> allWindows = driver.getWindowHandles(); // it will return the ID's of all opened windows in Set<String> variable and its retrn type is String

		ArrayList<String> tabs = new ArrayList<>(allWindows);
		System.out.println("Total number of windows:  "+tabs.size());
		
		//to navigate 2nd window - child window
		driver.switchTo().window(tabs.get(1)); //index will start from '0'
		System.out.println("Child window Page title:  " + driver.getTitle());
		Thread.sleep(5000);
		
		//to navigate 1st window - parent window
		driver.switchTo().window(tabs.get(0)); //index will start from '0'
		System.out.println("parent window Page title:  " + driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit(); // quit() is used to close all opened windows that was launched by WebDriver
	}
}
