package TestNG_Features;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class E14b_InvocationCount { //invocationCount - invocationCount allow to exec any test method multiple times. It allows to set int value i.e., @Test(invocationCount = 5)
	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {

		// driver = WebDriverManager.firefoxdriver().create();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Test(invocationCount = 3)
	public void verifyLinkedIn() throws Exception {

		System.out.println("Test Case 1 with Thread Id - " + Thread.currentThread().getId());

		driver.manage().window().maximize();
		Boolean linkedInIcon = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")).isEnabled();
		assertTrue(linkedInIcon);
		System.out.println("Test Case 1 pass: Successfully verified");
		Thread.sleep(600);
	}

	@Test(invocationCount = 2)
	public void validLoginTest() throws InterruptedException {

		System.out.println("Test Case 2 with Thread Id - " + Thread.currentThread().getId());

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String expectedTitle = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		Assert.assertTrue(expectedTitle.contains("Dashboard"), "Test Case 2 pass: Succesfully Logged in");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
