package Practice_Pa;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EX01_Editbox {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://login.salesforce.com");
	driver.manage().window().maximize();
	
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("Live");
	//to pause execution
	Thread.sleep(5000);
	
	//to clear data
	WebElement upass =driver.findElement(By.id("password"));
	upass.sendKeys("sss");
		
	//to enter "Tech" in Username" edit box
	uname.sendKeys("Tech");
}
}
