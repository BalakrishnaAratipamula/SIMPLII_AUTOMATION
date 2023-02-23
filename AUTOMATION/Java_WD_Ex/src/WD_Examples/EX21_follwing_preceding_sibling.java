package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX21_follwing_preceding_sibling {
	public static void main(String[] args) throws InterruptedException {
		// To Initialize Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		//to perform login operation
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//To pause execution
		Thread.sleep(3000);

		//to click on "Leave List"
		driver.findElement(By.linkText("Leave List")).click();
		Thread.sleep(3000);

		//to click on 'From' Date field ------------------------- following-sibling
		driver.findElement(By.xpath("//input[@id='calFromDate']/following-sibling::img")).click();  //img[1]
		Thread.sleep(3000);

		Select fromMonth = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		fromMonth.selectByVisibleText("Oct");
		Thread.sleep(1000);

		Select fromYear=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		fromYear.selectByVisibleText("2021");
		Thread.sleep(1000);

		//to select 29th
		driver.findElement(By.linkText("29")).click();
		Thread.sleep(3000); 

		//to click on 'To' Date field -------------------------- preceding-sibling
		driver.findElement(By.xpath("//form[@id='frmFilterLeave']/fieldset/ol/li[2]/img/preceding-sibling::input")).click();
		Thread.sleep(3000);   //////this much length is because normal way matching with first one

		Select toMonth=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		toMonth.selectByVisibleText("Sep");
		Thread.sleep(1000);

		Select toYear=new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		toYear.selectByVisibleText("2022");
		Thread.sleep(1000);

		//to select 29th
		driver.findElement(By.linkText("29")).click();
		Thread.sleep(3000);

		//to select 'ALL' check box
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		Thread.sleep(1000);

		//to click on Search button
		driver.findElement(By.id("btnSearch")).click();
		System.out.println("search activity performed"); 

		driver.quit();
	}
}
