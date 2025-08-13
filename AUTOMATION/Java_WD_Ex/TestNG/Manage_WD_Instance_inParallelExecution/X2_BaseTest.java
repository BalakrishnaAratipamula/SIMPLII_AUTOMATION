package Manage_WD_Instance_inParallelExecution;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class X2_BaseTest {
	@BeforeMethod
	public void setUp() {
		WebDriver driverInstance = new ChromeDriver();
		X1_DriverManager.setDriver(driverInstance);
		X1_DriverManager.getDriver().manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		X1_DriverManager.getDriver().quit();
		X1_DriverManager.unload();
	}
}
