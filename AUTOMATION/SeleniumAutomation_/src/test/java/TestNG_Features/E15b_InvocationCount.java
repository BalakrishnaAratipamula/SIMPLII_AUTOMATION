package TestNG_Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class E15b_InvocationCount {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(invocationCount = 2)
	public void loginTest() throws InterruptedException {
		System.out.println("Test Case 1 with Thread ID is:  "+Thread.currentThread().getId());
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		String expectedTitle = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		Assert.assertTrue("Test Case 1 is Fail: Login failed", expectedTitle.contains("Dashboard"));
		System.out.println("Test Case 1 is Pass: Successfull Logged in");
	}
	
	@Test(invocationCount = 3)
	public void verifyLinkedInIcon() throws InterruptedException {
		System.out.println("Test Case 2 with Thread ID is:  "+Thread.currentThread().getId());
		Boolean linkedInIcon = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")).isEnabled();
		Assert.assertTrue(linkedInIcon);
		System.out.println("Test Case 2 is Pass: Successfully verified");
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
