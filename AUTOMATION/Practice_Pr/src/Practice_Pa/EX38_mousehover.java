package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX38_mousehover {
public static void main(String[] args) throws Exception {
	// To initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement menuOption=driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
	Thread.sleep(6000);
	
	Actions act = new Actions(driver);
	act.moveToElement(menuOption).build().perform();
	Thread.sleep(12000);
	driver.findElement(By.xpath("//span[contains(text(),'Your Wish List')]")).click();
	
}
}
