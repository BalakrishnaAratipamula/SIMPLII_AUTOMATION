package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX44_ExceptionHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();

		//to check "username" edit box availability
		try {
			if(driver.findElement(By.id("username")).isDisplayed()) {
				System.out.println("Username edit box exist");
				driver.findElement(By.id("username")).sendKeys("userName"); //enter username
			}
		}
		catch(Exception e) {
			System.out.println("Specified element doensn't exist");

		}
		finally {
			System.out.println("from finally block");
		}

		Thread.sleep(1500);
		driver.findElement(By.name("pw")).sendKeys("password"); //enter password
		Thread.sleep(1000);
		
		driver.quit();
	}
}
