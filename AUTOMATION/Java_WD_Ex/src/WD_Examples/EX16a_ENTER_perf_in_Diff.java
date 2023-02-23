package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX16a_ENTER_perf_in_Diff {
	public static void main(String[] args) throws InterruptedException {
		// to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Selenium world");
		ele.submit(); 
		Thread.sleep(1500);
		
		driver.get("http://google.co.in");
		Thread.sleep(1500);
		driver.findElement(By.name("q")).sendKeys("Selenium world", Keys.ENTER);
		Thread.sleep(5000);
		
		driver.quit();
	}
}
