package Practice_Pa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex23_Synchronization_options {
public static void main(String[] args) {
	//to Initialize browser
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.apsrtconline.in/oprs-web/");
	driver.manage().window().maximize();
	
	//implicitlyWait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//to enter "NLR"
	driver.findElement(By.name("source")).sendKeys("NLR");
	//to pause Execution
	//Thread.sleep(5000);
	
	//to pause execution base don "KOVUR-NLR" WebElement availability
	Wait<WebDriver> wt = new WebDriverWait(driver,30);
	wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("KOVUR-NLR")));
	
	driver.findElement(By.linkText("KOVUR-NLR")).click();
}
}
