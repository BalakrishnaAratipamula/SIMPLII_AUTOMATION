package RuntimeP_or_MethodOverridingE5_RealTimeEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class E1_BaseClass {
	protected WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.co.in/");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
