package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E53_HandleDynamicElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to get cell data by handling dynamic web table
		getCellValue(driver, 1, 2); //row, column
		
		//to handle dynamic links / tabs
		getTabName(driver, "Insurance Project");
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	//1.
	static void getCellValue(WebDriver driver, int row, int col) {
		String innerText = driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+col+"]")).getText();
		System.out.println("Call text is:  "+innerText);
	}
	
	//2.
	static void getTabName(WebDriver driver, String tabName) throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'"+tabName+"')]")).click();
		Thread.sleep(2000);
		System.out.println("Window Page Title is:  " + driver.getTitle());
	}
}
