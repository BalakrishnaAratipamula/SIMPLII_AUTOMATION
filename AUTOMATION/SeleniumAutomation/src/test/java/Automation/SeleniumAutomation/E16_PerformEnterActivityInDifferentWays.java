package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E16_PerformEnterActivityInDifferentWays {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		/*/ 1
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Selenium World");
		ele.submit(); //*/
		
		// 2
		driver.findElement(By.name("q")).sendKeys("Selenium World", Keys.ENTER); //*/
		
		System.out.println("Enter Activity Performed");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
