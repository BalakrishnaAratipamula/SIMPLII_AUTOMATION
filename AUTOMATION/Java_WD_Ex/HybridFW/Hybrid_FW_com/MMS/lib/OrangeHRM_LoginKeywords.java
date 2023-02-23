package Hybrid_FW_com.MMS.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LoginKeywords {
	
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
				
	}
	
	public void navigateURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	public void enterUsername() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}
	
	public void enterPassword() {
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}
	
	public void clickLogin() {
		driver.findElement(By.name("Submit")).click();
	}
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}

}
