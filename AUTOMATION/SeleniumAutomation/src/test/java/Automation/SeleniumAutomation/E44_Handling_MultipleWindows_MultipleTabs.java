package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E44_Handling_MultipleWindows_MultipleTabs {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*/Execution 1: Handling Multiple windows
		//click on [Open Window]
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(3000);
		//get Window Handles
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println("total windows count:  "+allWindows.size());
		
		//Get Window Handle ids into ArrayList
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		
		//navigate to Parent window
		driver.switchTo().window(tabs.get(0)); //index will start from 0
		System.out.println("Paren window page title:  "+driver.getTitle());
		Thread.sleep(3000);
		//navigate to Child window
		driver.switchTo().window(tabs.get(1)); // index will start from 0
		System.out.println("Child window page title:  "+driver.getTitle());
		Thread.sleep(3000);
		//navigate to Parent window
		driver.switchTo().window(tabs.get(0)); // index will start from 0
		System.out.println("Parent window page title:  " +driver.getTitle()); //*/

		
		//Execution 2: Handling Multiple Tabs
		// click on [Open Tab]
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(3000);
		// get Window Handles
		Set<String> allWindows = driver.getWindowHandles();

		System.out.println("total windows count:  " + allWindows.size());

		// Get Window Handle ids into ArrayList
		ArrayList<String> tabs = new ArrayList<>(allWindows);

		// navigate to Parent window
		driver.switchTo().window(tabs.get(0)); // index will start from 0
		System.out.println("Paren window page title:  " + driver.getTitle());
		Thread.sleep(3000);
		// navigate to Child window
		driver.switchTo().window(tabs.get(1)); // index will start from 0
		System.out.println("Child window page title:  " + driver.getTitle());
		Thread.sleep(3000);
		// navigate to Parent window
		driver.switchTo().window(tabs.get(0)); // index will start from 0
		System.out.println("Parent window page title:  " +driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
