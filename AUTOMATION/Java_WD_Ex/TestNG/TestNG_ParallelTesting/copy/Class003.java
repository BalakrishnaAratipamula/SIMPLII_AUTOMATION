package TestNG_ParallelTesting.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class003 {
	@Test
	public void method01() throws InterruptedException {
		// EdgeDriver
//		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.irctc.co.in/");
		System.out.println("******IRCTC Application Opend on Edge Browser******"+driver.getTitle());
		Thread.sleep(8000);
		System.out.println("******IRCTC Application Closed on Edge Browser******");
		driver.quit();
	}
	@Test
	public void method02() {
		Reporter.log("Method02 from Class003", true);
	}
	@Test
	public void method03() {
		Reporter.log("Method03 from Class003", true);
	}
}
