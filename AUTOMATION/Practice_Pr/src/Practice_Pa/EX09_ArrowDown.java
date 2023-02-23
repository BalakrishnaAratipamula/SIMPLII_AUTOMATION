package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX09_ArrowDown {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver","E:\\Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.navigate().to("https://www.apsrtconline.in/oprs-web/");
	driver.manage().window().maximize();
	
	//to create reference object for from DD
	WebElement fromList = driver.findElement(By.name("source"));
	fromList.sendKeys("NLR");
	Thread.sleep(3000);
	fromList.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	fromList.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	fromList.sendKeys(Keys.ENTER);

	
}
}
