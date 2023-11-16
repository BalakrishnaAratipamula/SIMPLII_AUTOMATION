package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.apache.log4j.Logger;

public class General extends Global {
	Logger Log;

	public void setUp() {

		System.setProperty("webdriver.chrome.chrome", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Log.info("SUccessfully Navigated to OHRM Application Home Page");
	}

	public void tearDown() {
		driver.quit();
		Log.info("OHRM Application Successfully closed");
	}

	public void verifyLogin() {
		String Actual_verifyLoginTest = driver.findElement(By.id("welcome")).getText();
		Assert.assertTrue(Actual_verifyLoginTest.equals("Welcome Admin"));
		Log.info("Successfully Logged into OHRM Application");
	}

	public void Login() {
		driver.findElement(By.id(text_UserName)).sendKeys(UserName);
		Log.info("Entered UserName Successfully");
		driver.findElement(By.id("text_Password")).sendKeys(Password);
		Log.info("Entered Password Successfully");
		driver.findElement(By.id(text_SubmitButton)).click();
		Log.info("perform click operations of Login Button");
		Log.info("Login Successfully");
	}

	public void pim() throws InterruptedException {
		WebElement pim = driver.findElement(By.id(text_PIM));
		Actions act = new Actions(driver);
		act.moveToElement(pim).build().perform();
		Log.info("MouseHover on PIM");
		Thread.sleep(5000);
	}

	public void addEmployee() {
		driver.findElement(By.id(text_Addemployee)).click();
		Log.info("Perform click on AddEmployee");

		driver.findElement(By.id(text_FirstName)).sendKeys("Madhu");
		Log.info("Entered firstName");

		driver.findElement(By.id(text_MiddleName)).sendKeys("Varma");
		Log.info("Entered MiddleName");

		driver.findElement(By.id(text_LastName)).sendKeys("Badhe");
		Log.info("Entered LastName");

		String empId = driver.findElement(By.id(text_EmpId)).getAttribute("value");
		Log.info("Employee id is :" + empId);

		driver.findElement(By.id(text_SaveButton)).click();
		Log.info("Click on Save Button");

		String reg_EmpName = driver.findElement(By.xpath("//*[eid='profile-pic']/h1")).getText();
		Log.info("Registered Employee name is :" + reg_EmpName);

	}

	public void LogOut() {
		driver.findElement(By.id(text_WelcomeMessage)).click();
		Log.info("Click on Webelement Admin Link");

		driver.findElement(By.linkText(text_Logout)).click();
		Log.info("Click on Logout");

		Log.info("Successfully Logged Out of OHRM Apllication");
	}

}
