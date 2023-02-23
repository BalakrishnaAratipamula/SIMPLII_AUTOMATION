package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex21_orangrHRM {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers.chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	//to perform login operation
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(1800);
	
	//to click on "Leave" link
	driver.findElement(By.linkText("Leave")).click();
	Thread.sleep(5000);
	//to clickon "Leave List"
	driver.findElement(By.linkText("Leave List")).click();
	Thread.sleep(5000);
	
	//to click on From Date field
	driver.findElement(By.xpath("//input[@id='calFromDate']/following::img[1]")).click();
	Thread.sleep(5000);
	
	Select fromMonth=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
	fromMonth.selectByVisibleText("Aug");
	
	Select fromYear=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
	fromYear.selectByVisibleText("2019");
	
	//to select 29th
	driver.findElement(By.linkText("29")).click();
	Thread.sleep(5000);
	
	//to click on To Date field
	driver.findElement(By.xpath("//input[@id='calToDate']/following::img[1]")).click();
	Thread.sleep(5000);
	
	Select toMonth=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
	toMonth.selectByVisibleText("Sep");
	
	Select toYear=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
	toYear.selectByVisibleText("2019");
	
	//to select 29th
	driver.findElement(By.linkText("29")).click();
	
	//to select 'ALL' check box
	driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
	
	//to click on Search button
	driver.findElement(By.id("btnSearch")).click();
	System.out.println("search activity performed");

	
}
}
