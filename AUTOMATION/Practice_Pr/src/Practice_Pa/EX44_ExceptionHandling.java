package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX44_ExceptionHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	//to check user name edit box availability
	try {
		if(driver.findElement(By.id("username")).isDisplayed()) {
			System.out.println("username edit box exixts");
		}
	}
	catch(Exception e) {
		System.out.println("username edit box does not exixt");
		}
	finally {
		System.out.println("from finally block");
	}
}
}
