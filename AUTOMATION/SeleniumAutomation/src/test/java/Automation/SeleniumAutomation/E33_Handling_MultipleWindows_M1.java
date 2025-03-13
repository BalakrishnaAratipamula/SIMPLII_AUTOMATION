package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E33_Handling_MultipleWindows_M1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// get 1st window Page title
		System.out.println("1st window Page title:  " + driver.getTitle());

		// click on 'Help' btn
		driver.findElement(By.linkText("Help")).click();

		// To read window handles
		Set<String> pgHandles = driver.getWindowHandles(); // it will return the ID's of all opened windows in Set<String> variable and its retrn type is String
		Iterator<String> winHandles = pgHandles.iterator(); // 'Iterator' read each window id from Set<String> variable

		// Store the each 'Window handle value' into 'String variable' from
		// Iterator<String> variable
		String w1 = winHandles.next();
		String w2 = winHandles.next();
		System.out.println("********** "+w1+" **********");
		System.out.println("********** "+w2+" **********");
		
		// to work on 2nd widow
		driver.switchTo().window(w2); // w2 - window id
		// get 2nd window Page title
		System.out.println("2nd window Page title:  " + driver.getTitle());

		// to work on 1st widow
		driver.switchTo().window(w1); // w2 - window id
		// get 1st window Page title
		System.out.println("1st window Page title:  " + driver.getTitle());
				
		Thread.sleep(5000);
		driver.quit();
	}
}