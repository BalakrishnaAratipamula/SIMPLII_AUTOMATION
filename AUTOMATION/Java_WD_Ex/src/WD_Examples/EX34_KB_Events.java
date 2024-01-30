package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX34_KB_Events {
	public static void main(String[] args) throws Exception{
		// To initialize browser
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http:\\google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Create Reference object for Search editbox
		WebElement txtSearch=driver.findElement(By.name("q"));

		//to enter value in Search editbox
		txtSearch.sendKeys("selenium");
		Thread.sleep(5000);
		txtSearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);	
		txtSearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);		
		txtSearch.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);		
		txtSearch.sendKeys(Keys.ARROW_UP);       ///////ARROW_RIGHT ARROW_LEFT
		Thread.sleep(2000);	
		txtSearch.sendKeys(Keys.ENTER); 

		driver.quit();

	}
}
