package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX18B_ReadallthecallvaluesfromWT {
public static void main(String[] args) {
	//to initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	//create reference object for WebTable
	WebElement myTable=driver.findElement(By.id("customers"));
	
	List<WebElement> trs = myTable.findElements(By.tagName("tr"));
	System.out.println("Total number of 'tr' tags are: "+trs.size());
	for(WebElement tr: trs) {
		List<WebElement> tds = tr.findElements(By.tagName("td"));
		System.out.println("Total number of 'td' tags are: "+tds.size());
		for(WebElement td:tds) {
			System.out.println(td.getText());
		}
		System.out.println("=====================");
		}
		
}
}