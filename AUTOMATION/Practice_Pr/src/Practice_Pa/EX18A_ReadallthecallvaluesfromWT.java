package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX18A_ReadallthecallvaluesfromWT {
public static void main(String[] args) {
	//to initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	//create reference obj for WebElement
	WebElement refobj = driver.findElement(By.id("customers"));//id("customers")-----table------tagname for table
	//to collection
	List<WebElement> cell = refobj.findElements(By.tagName("td"));//tagName("td") is common for every cell in a table
	
	for(WebElement cells: cell) {
		System.out.println(cells.getText());
		}
}
}
