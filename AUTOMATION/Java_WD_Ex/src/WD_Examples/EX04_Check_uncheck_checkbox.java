//write script to check and uncheck "Remember me" checkbox in SalesForce application
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX04_Check_uncheck_checkbox {
	public static void main(String[] args) throws Exception{
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:/login.salesforce.com");
		driver.manage().window().maximize();

		//to select checkbox
/*M1*/	driver.findElement(By.id("rememberUn")).click();
		Thread.sleep(5000);
/*M2*/	//driver.findElement(By.id("rememberUn")).sendKeys(Keys.ENTER); 
		//Thread.sleep(5000);
/*M3*/	//driver.findElement(By.id("rememberUn")).submit();
		//Thread.sleep(5000);
		//to uncheck checkbox
		driver.findElement(By.id("rememberUn")).click();
		Thread.sleep(1800);

		driver.quit();

	}
}
