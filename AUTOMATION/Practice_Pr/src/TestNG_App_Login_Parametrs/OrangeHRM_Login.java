package TestNG_App_Login_Parametrs;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class OrangeHRM_Login {
	WebDriver driver;
	//to initialize browser
	@BeforeClass
	@Parameters({"url"})
	public void setUp(String URL) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//to perform login validation
	@Test
	@Parameters({"uid","pwd"})
	public void userLogin(String userId, String passWd) throws Exception {
		driver.findElement(By.id("txtUsername")).sendKeys(userId);
		driver.findElement(By.id("txtPassword")).sendKeys(passWd);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "---------Title not match-------");
		//to send user msg into HTML reports and log section
		Reporter.log("Successful Login operation", true);
	}
	
	@AfterClass
	//to close application
	public void tearDown() {
		driver.close();
	}

}
