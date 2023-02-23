package TestNG_with_WD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_FW {
	
	public static WebDriver driver;
	
	//to initialize browser
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	//to perform login operation and validation
	@Test
	public void userLogin() throws Exception {
		WebElement objUserName = driver.findElement(By.id("txtUsername"));
		if(objUserName.isDisplayed()) {
			Reporter.log("username Editbox is Displayed and Perfroming login operation", true);
			//perform login operation
			objUserName.sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(5000);
			
			String pgTitle=driver.getTitle();
			Assert.assertEquals(pgTitle, "OrangeHRM");
			Reporter.log("Successful login operation", true);

		}
		else {
			System.out.println("Username Editbox is not exist");
		}
	}
	
	//to close application
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}