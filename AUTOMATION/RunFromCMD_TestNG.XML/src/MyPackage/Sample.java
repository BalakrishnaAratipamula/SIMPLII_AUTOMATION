package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void myTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/"); 
		System.out.println("Browser launched");
		
		driver.quit();
	}
	
	@Test
	public void myTest1() {
		System.out.println("Running from CMD.....");
	}
}
