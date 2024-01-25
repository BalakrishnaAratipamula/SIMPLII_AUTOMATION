package ReRun_Failed_TCs_usingTestNgFailedXMLfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript {	//https://youtu.be/0BuKoFPfIhs?si=v-sUa1nY5j47iWbz
	/* Steps: 
	 * Execute below Tests 
	 * after execution F5 and go to test-output folder --> testng-failed.xml file
	 * fix errors and re execute through testng-failed.xml file*/
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test 
	public void testMethod() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");	//Actual: Google
	}
	
	@Test
	public void testMethod2() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Amazon");
//		Thread.sleep(8000);		//getting error without time delay 
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void testMethod3() {
		assert false;	//by default it will get fail
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
