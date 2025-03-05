package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E18_ReadALlCellValues_FromWebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		WebElement parent = driver.findElement(By.id("customers")) ;
		
		//to print table headers
		List<WebElement> ths = parent.findElements(By.tagName("th"));
		for(WebElement th : ths) {
			System.out.println(th.getText());
		}
		
		//to print table cell data
		List<WebElement> tds = parent.findElements(By.tagName("td"));
		for(WebElement td : tds) {
			System.out.println(td.getText());
		}
		
		driver.quit();
	}
}
