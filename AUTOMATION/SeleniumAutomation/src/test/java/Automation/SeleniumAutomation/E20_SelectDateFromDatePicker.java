package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E20_SelectDateFromDatePicker {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//to click on date field
		driver.findElement(By.xpath("//*[@id='jDate']/span/input")).click();
		Thread.sleep(3000);
		
		// to click on day 29th
		driver.findElement(By.xpath("//td/a[text()='29']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
