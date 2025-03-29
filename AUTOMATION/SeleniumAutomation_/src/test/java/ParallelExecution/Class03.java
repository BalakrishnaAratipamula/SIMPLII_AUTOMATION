package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class03 {
	//Edge Browser
	@Test
	public void method1() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(1000);
		System.out.println("*****IRCTC application get Opened*****And Page Title is:  "+driver.getTitle());
		Thread.sleep(2000);
		System.out.println("*****IRCTC application get Closed*****");
		driver.quit();
	}
}
