package Hybrid_FW_com.MMS.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_Exp {
	
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
				
	}
	public void navigateURL() {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
	
	public void registerlink() {
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	public void firstname() {
		driver.findElement(By.name("firstName")).sendKeys("Balakrishna");
	}
	
	public void lastname() {
		driver.findElement(By.name("lastName")).sendKeys("Aratipamula");
	}
	public void phonenum() {
		driver.findElement(By.name("phone")).sendKeys("7981577608");
	}
	
	public void address() {
		driver.findElement(By.name("address1")).sendKeys("Kavali");
	}
	public void city() {
		driver.findElement(By.name("city")).sendKeys("Kavali");
	}
	
	public void state() {
		driver.findElement(By.name("state")).sendKeys("AP");
	}
	
	public void postalcode() {
		driver.findElement(By.name("postalCode")).sendKeys("524201");
	}
	public void country() {
		Select dd=new Select(driver.findElement(By.name("country")));
		dd.selectByVisibleText("ALGERIA");
	}
	
	public void username() {
		driver.findElement(By.id("email")).sendKeys("Balakrishna");
	}
	public void pass() {
		driver.findElement(By.name("password")).sendKeys("Balakrishna1234");
	}
	public void cpass() {
		driver.findElement(By.name("confirmPassword")).sendKeys("Balakrishna1234");
	}
	public void submit() {
		driver.findElement(By.name("register")).click();
	}
	public void signoff() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	public void username2() {
		driver.findElement(By.name("userName")).sendKeys("mercury");
	}
	public void pass2() {
		driver.findElement(By.name("password")).sendKeys("mercury");
	}
	public void submit2() {
		driver.findElement(By.name("login")).click();
	}
	public void passengers() {
		Select dd2=new Select(driver.findElement(By.name("passCount")));
		dd2.selectByValue("1");
	}
	public void dptfrom() {
		Select dd3=new Select(driver.findElement(By.name("fromPort")));
		dd3.selectByVisibleText("Acapulco");
	}
	public void on() {
		Select dd4=new Select(driver.findElement(By.name("fromMonth")));
		dd4.selectByValue("1");
	}
	public void on2() {
		Select dd5=new Select(driver.findElement(By.name("fromDay")));
		dd5.selectByValue("1");
	}
	public void arrin() {
		Select dd6=new Select(driver.findElement(By.name("toPort")));
		dd6.selectByVisibleText("Frankfurt");
	}
	public void ret() {
		Select dd7=new Select(driver.findElement(By.name("fromMonth")));
		dd7.selectByValue("5");
	}
	public void ret2() {
		Select dd8=new Select(driver.findElement(By.name("fromDay")));
		dd8.selectByValue("5");
	}
	public void sc() {
		driver.findElement(By.name("servClass")).click();
	}
	public void airline() {
		Select dd8=new Select(driver.findElement(By.name("airline")));
		dd8.selectByVisibleText("No Preference");
	}
	public void continu() {
		driver.findElement(By.name("findFlights")).click();
	}
	public void DEP() {
		driver.findElement(By.name("outFlight")).click();
	}
	public void RET() {
		driver.findElement(By.name("inFlight")).click();
	}
	public void cotntnu2() {
		driver.findElement(By.name("reserveFlights")).click();
	}
	

}
