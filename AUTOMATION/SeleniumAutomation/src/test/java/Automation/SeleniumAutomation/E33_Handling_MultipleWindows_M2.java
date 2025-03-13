package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E33_Handling_MultipleWindows_M2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// get 1st window Page title
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id:  " + parent); //parent
		System.out.println("Parent window Page title:  " + driver.getTitle()); 
		
		// click on 'Click this link to start new Tab'
		driver.findElement(By.linkText("Click this link to start new Tab")).click();

		// To read window handles
		Set<String> allWindows = driver.getWindowHandles(); // it will return the ID's of all opened windows in Set<String> variable and its retrn type is String

		int winCount = allWindows.size();
		System.out.println("Total window coung:  "+winCount);

		//navigate to child window
		for(String child : allWindows) {
//			System.out.println("child: "+child+" parent:  "+parent);
			if(!parent.equalsIgnoreCase(child)) { //not parent
				driver.switchTo().window(child); //allow to Switch child window
				System.out.println("Child window Page title is:  "+ driver.getTitle()); //child
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("[name='q']")).sendKeys("Selenium WebDriver");
				Thread.sleep(5000);
				
				driver.close(); //close() is used to close current focusing window that was launched by WebDriver
			}
		} //*/
		
		Thread.sleep(5000); 
		driver.quit(); //quit() is used to close all opened  windows that was launched by WebDriver
	}
}
