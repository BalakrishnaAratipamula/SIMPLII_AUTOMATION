package TestNG_CrossBrowser_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Testing {
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters({"Desired_Browser"})
	public void setUp(String testBrowser) {
		switch(testBrowser.toUpperCase()) {
		case "FF":
			System.out.println("Script executing on Firefox browser");
//			System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "CHROME":
			System.out.println("Script executing on Chrome browser");
//			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
//			System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");
			driver = new EdgeDriver();
			break;
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//to perform login validation
	@Test
	public void userLogin() throws InterruptedException, Exception {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		if(checkVerificationStatusAfterLoggedIn()) {
			Reporter.log("Successful login operation***", true);
		}
		else {
			Reporter.log("Unsuccessful login operation", true);
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	} 
	
	Boolean checkVerificationStatusAfterLoggedIn() {
		String expectedTitle = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		Assert.assertTrue(expectedTitle.contains("Dashboard"), "Unsuccessfull Login operation");
		return true;
	}
}

