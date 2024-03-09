package TestNG_with_WD;

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

public class InvocationCount_E {
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
	public void verifyLinkedIn() {

		System.out.println("Test Case 1 with Thread Id - " + Thread.currentThread().getId());

		driver.manage().window().maximize();
		Boolean linkedInIcon = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")).isEnabled();
		assertTrue(linkedInIcon);
	}

	@Test(invocationCount = 2)
	public void validLoginTest() throws InterruptedException {

		System.out.println("Test Case 2 with Thread Id - " + Thread.currentThread().getId());

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String expectedTitle = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h1")).getText();
//		Assert.assertTrue(expectedTitle.contains("Dashboard"));
	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();

	}
}
