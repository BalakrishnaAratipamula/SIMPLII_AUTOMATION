package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX36_Drag_And_Drop {
public static void main(String[] args) throws Exception{
	// To initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	//create reference object for WebElements
	driver.switchTo().frame(0);
	Thread.sleep(5000);
	
	WebElement wele1 = driver.findElement(By.id("draggable"));
	WebElement wele2 = driver.findElement(By.id("droppable"));
	
	//to create a obj to Actions class
	Actions act = new Actions(driver);
	act.dragAndDrop(wele1, wele2).build().perform();	
	
}
}
