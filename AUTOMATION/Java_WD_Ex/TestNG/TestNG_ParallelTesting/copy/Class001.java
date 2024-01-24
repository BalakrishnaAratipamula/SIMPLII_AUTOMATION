package TestNG_ParallelTesting.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class001 {
	@Test
	public void method01() throws InterruptedException {
		// geckoDriver
//		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://netbanking.hdfcbank.com/");
		System.out.println("******Netbanking Application closed on FF Browser******");
		driver.quit();
	}

	@Test
	public void method02() {
		Reporter.log("Method02 from Class001", true);
	}
}
