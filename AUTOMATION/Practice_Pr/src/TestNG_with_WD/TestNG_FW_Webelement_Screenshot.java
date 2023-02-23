package TestNG_with_WD;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.Point;

public class TestNG_FW_Webelement_Screenshot {
public static WebDriver driver;
	
	//to initialize browser
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	//To perform login operation
	@Test
	public void logIn() throws Exception {
		WebElement objUserName = driver.findElement(By.id("txtUsername"));
		if(objUserName.isDisplayed()) {
			Reporter.log("username Editbox is Displayed so Perfroming login operation", true);
			//to perform login operation
			objUserName.sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			Thread.sleep(6000);
			
			//to take screenshot of particular WebElement
			WebElement ele = driver.findElement(By.id("btnLogin"));
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot, new File("F:\\WebElementSC.png"));
			//Reporter.log("<br><img src='"+screenshot+"'height='400' width='400'/><br>");
			/*String filePath = screenshot.toString();
			String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";
			Reporter.log(path);*/
			ele.click();
			Thread.sleep(5000);
			
			String pgTitle=driver.getTitle();
			Assert.assertEquals(pgTitle, "OrangeHRM");
			Reporter.log("Successful login operation", true);
		}
		else {
			Reporter.log("username Editbox is not Displayed so unable to Perfrom login operation", true);		
		}
	}	
	
	//to close application
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
