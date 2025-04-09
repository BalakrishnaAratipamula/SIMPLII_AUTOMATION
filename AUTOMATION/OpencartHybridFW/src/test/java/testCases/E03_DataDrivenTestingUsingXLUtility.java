package testCases;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ExcelUtility;

public class E03_DataDrivenTestingUsingXLUtility {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		try {
			//SIGN-ON
			driver.findElement(By.linkText("SIGN-ON")).click();
			
			String path = "E:\\DDT NewTours Login Data .xlsx";
			ExcelUtility.setExcelFile(path, "Sheet1");
			//to get the rowCount
			int rows = ExcelUtility.getRowCount(path, "Sheet1");
			
			for(int i=1; i<=rows; i++) {
				String userName = ExcelUtility.getCellData(path, "Sheet1", i, 0); //i-row iteration, 0-colNum (0 bcz userName is on column1 i.e. c0)
				String pwd = ExcelUtility.getCellData(path, "Sheet1", i, 1); //i-row iteration, 1-colNum (1 bcz password is on column2 i.e. c1)
			
				//to perform Login Operation
				driver.findElement(By.name("userName")).sendKeys(userName);
				driver.findElement(By.name("password")).sendKeys(pwd);
				Thread.sleep(1000);
				driver.findElement(By.name("submit")).click();
				Thread.sleep(2000);
				
				//Validation
				String pageTitle = driver.getTitle();
				if(pageTitle.equals("Login: Mercury Tours")) {
					System.out.println("Test is Passed");
					ExcelUtility.setCellData(path, "Sheet1", i, 2, "Successful Opertion");
				} else {
					System.out.println("Test is Failed");
					ExcelUtility.setCellData(path, "Sheet1", i, 2, "Unuccessful Opertion");
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(driver!=null) {
				Thread.sleep(3000);
				driver.quit();
			}
		}
	}
}
