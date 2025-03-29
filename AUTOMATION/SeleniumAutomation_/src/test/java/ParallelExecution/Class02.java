package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class02 {
	//Chrome Browser
	@Test
	public void method1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		System.out.println("*****FaceBook application get Opened*****And Page Title is:  "+driver.getTitle());
		Thread.sleep(2000);
		System.out.println("*****FaceBook application get Closed*****");
		driver.quit();
	}
}
