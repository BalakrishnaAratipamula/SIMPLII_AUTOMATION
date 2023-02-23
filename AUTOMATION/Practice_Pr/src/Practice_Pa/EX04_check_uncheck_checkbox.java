//write script to check and uncheck "Remember me" checkbox in SalesForce application
package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class EX04_check_uncheck_checkbox {
public static void main(String[] args) throws Exception{
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:/login.salesforce.com");
		driver.manage().window().maximize();
		//to select checkbox
		driver.findElement(By.id("rememberUn")).click();
		Thread.sleep(5000);
		//to uncheck checkbox
		driver.findElement(By.id("rememberUn")).click();
		Thread.sleep(1800);
		driver.close();
		
}
}
