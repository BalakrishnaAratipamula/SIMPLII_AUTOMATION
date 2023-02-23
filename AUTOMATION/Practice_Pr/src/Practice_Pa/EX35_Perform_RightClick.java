package Practice_Pa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EX35_Perform_RightClick {
public static void main(String[] args) throws Exception {
	// To initialize browser
	System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	
	//create reference object for this button
	WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	//create a object for Actions class
	Actions act = new Actions(driver);
	
	act.moveToElement(button).contextClick().build().perform();
	Thread.sleep(3000);
	
	//to click on "Paste"
	driver.findElement(By.xpath("//span[text()='Paste']")).click();
	Thread.sleep(3000);
	
	//to read msg from alert window
	Alert art = driver.switchTo().alert();
	System.out.println("Alert window msg is:   "+art.getText());
	art.accept();
	
}
}
