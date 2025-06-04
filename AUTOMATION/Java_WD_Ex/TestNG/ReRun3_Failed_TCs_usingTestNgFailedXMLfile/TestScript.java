package ReRun3_Failed_TCs_usingTestNgFailedXMLfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript {	//https://youtu.be/0BuKoFPfIhs?si=v-sUa1nY5j47iWbz
	/* Steps: 
	 * Execute below Tests 
	 * after execution 'Refresh on project' and go to test-output folder --> testng-failed.xml file
	 * fix errors and re execute through testng-failed.xml file*/
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test 
	public void testMethod1() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Test Login | Practice Test Automation");	
	}
	
	@Test
	public void testMethod2() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		System.out.println("PageTitle is:  "+driver.getTitle());
		Thread.sleep(3000);
	}
	
	@Test
	public void testMethod3() {
		assert true; //Intentional failing
	}
	
	@Test
	public void testMethod4() {
		assert true; 
	}
	
	@Test
	public void testMethod5() {
		assert false; //Intentional failing
	}
	
	@AfterTest
	public void afterTest() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
