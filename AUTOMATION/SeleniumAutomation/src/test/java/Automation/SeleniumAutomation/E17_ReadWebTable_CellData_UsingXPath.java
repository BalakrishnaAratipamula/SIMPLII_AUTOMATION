package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E17_ReadWebTable_CellData_UsingXPath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//to read 6th row, 3rd cell data 
		String cellData = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[6]/td[3]")).getText();
		System.out.println(cellData);
		
		//to read 7th row, 1st cell data 
		String cellData2 = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[7]/td[1]")).getText();
		System.out.println(cellData2);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
