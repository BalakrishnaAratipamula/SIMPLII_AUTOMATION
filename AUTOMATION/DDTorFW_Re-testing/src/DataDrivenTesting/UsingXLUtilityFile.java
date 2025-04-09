package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DDT_FW.XLUtils;

public class UsingXLUtilityFile {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/"); // http://newtours.demoaut.com
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			String path = "F:\\DDT Mercury.xlsx";
			XLUtils.setExcelFile(path, "Sheet1");
			int rows = XLUtils.getRowCount(path, "Sheet1");
			
			//SIGN-ON
			driver.findElement(By.linkText("SIGN-ON")).click();
			for (int i = 1; i <= rows; i++) {

				String username = XLUtils.getCellData(path, "Sheet1", i, 0);// i-rowNum, 0-colNum (having userName validation data)
				String pwd = XLUtils.getCellData(path, "Sheet1", i, 1);// i-rowNum, 1-colNum (having password validation data)

				// to perform login operation
				driver.findElement(By.name("userName")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys(pwd);
				Thread.sleep(1000);
				driver.findElement(By.name("submit")).click();
				Thread.sleep(3000);
				// to read page title
				String pageSource = driver.getTitle();
				if (pageSource.equals("Login: Mercury Tours")) {
					System.out.println("Test passed");
					XLUtils.setCellData(path, "Sheet1", i, 2, "Successful login operation");
					driver.findElement(By.linkText("SIGN-OFF")).click();
				} else {
					System.out.println("Test Failed");
					XLUtils.setCellData(path, "Sheet1", i, 2, "Unsuccessful login operation");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (driver != null) {
				Thread.sleep(3000);
				driver.quit();
			}
		}
	}
}
