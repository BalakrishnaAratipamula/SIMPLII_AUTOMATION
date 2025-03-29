package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class01 {
	//Firefox Browser
	@Test
	public void method1() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(1000);
		System.out.println("*****HDFC Net banking application get Opened*****And Page Title is:  "+driver.getTitle());
		Thread.sleep(2000);
		System.out.println("*****HDFC Net banking application get Closed*****");
		driver.quit();
	}
}
