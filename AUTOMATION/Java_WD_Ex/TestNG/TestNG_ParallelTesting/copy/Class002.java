package TestNG_ParallelTesting.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class002 {
	@Test
	public void method01() throws InterruptedException {
		// ChromeDriver
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(25000);
		System.out.println("******Facebook Application closed on CH Browser******");
		driver.quit();
	}

	@Test
	public void method02() {
		Reporter.log("Method02 from Class002", true);
	}
}
