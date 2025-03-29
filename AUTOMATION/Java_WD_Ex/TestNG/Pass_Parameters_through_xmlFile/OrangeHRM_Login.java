package Pass_Parameters_through_xmlFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM_Login {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({ "urlfromsuite" })
	public void setUp(String URL) {
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	// to perform login validation
	@Test
	@Parameters({ "uidfromsuite", "pwdfromsuite" })
	public void userLogin(String userId, String passWd) throws Exception {
		driver.findElement(By.name("username")).sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(passWd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//Dashboard
		String expectedTitle = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		Assert.assertTrue(expectedTitle.contains("Dashboard"), "Test Case 1 is Fail: Login failed");
		Reporter.log("Successful Login operation", true);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		if(driver!=null) {
			driver.quit();
		}
	}
}
