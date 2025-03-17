package WD_Examples;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX33_Handling_MultipleWindows_MultipleTabs {
	//////////// Multiple windows and Multiple Tabs both can handle in same way
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		/*/Execution:1 - Handling Multiple Windows
		//click on [Open Window]
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(3000);
		
		Set<String> allwindows = driver.getWindowHandles();

		int count = allwindows.size();
		System.out.println("total windows count:  " + count);
		
		//navigate to parent window
		ArrayList<String> tabs = new ArrayList<>(allwindows); //by passing arg - allwindows it will convert into ArrayList
		driver.switchTo().window(tabs.get(1));
		System.out.println("Parent window Page title  :"+driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));
		System.out.println("Child window Page title  :"+driver.getTitle()); 
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Child window Page title  :"+driver.getTitle()); //*/
		
		//Execution:2 - Handling Multiple Tabs
		// click on [Open Tab]
		driver.findElement(By.id("opentab")).click();
		Thread.sleep(3000);

		Set<String> allwindows = driver.getWindowHandles();

		int count = allwindows.size();
		System.out.println("total windows count:  " + count);

		// navigate to parent window
		ArrayList<String> tabs = new ArrayList<>(allwindows); // by passing arg - allwindows it will convert into ArrayList
		driver.switchTo().window(tabs.get(1));
		System.out.println("Parent window Page title  :" + driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));
		System.out.println("Child window Page title  :"+driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Parent window Page title  :" + driver.getTitle()); //*/
		
		Thread.sleep(3000);
		driver.quit();
	}
}
