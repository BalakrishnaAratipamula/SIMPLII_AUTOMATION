package DataDrivenTesting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DDT_FW.XLUtils;

public class UsingXLUtilityFile {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String path="F:\\Mercury login data.xlsx";    //‪F:\mercury login data.xlsx
		XLUtils.setExcelFile(path, "Sheet1");
		int rows=XLUtils.getRowCount(path, "Sheet1");
		for(int i=1; i<=rows; i++) {
			
			String username=XLUtils.getCellData(path, "Sheet1", i, 0);//i-rownum, 0-colnum (having username validation data)
			String pwd=XLUtils.getCellData(path, "Sheet1", i, 1);//i-rownum, 1-colnum (having password validation data)

			//to perform login operation	
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("login")).click();
			Thread.sleep(8000);
			//to read page title
			String pgTitle=driver.getTitle();
			if(pgTitle.equals("Find a Flight: Mercury Tours:")) {
				System.out.println("Test passed");
				XLUtils.setCellData(path, "Sheet1", i, 2, "Successful login operation");
				driver.findElement(By.linkText("SIGN-OFF")).click();	
			}
			else {
				System.out.println("Test Failed");
				XLUtils.setCellData(path, "Sheet1", i, 2, "Unsuccessful login operation");
			}
			driver.findElement(By.linkText("Home")).click();
		}
	}
}
