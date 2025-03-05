package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E18b_ReadALlCellValues_FromWebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		WebElement parent = driver.findElement(By.id("customers"));
		
		//to find  list of 'tr' tags
		List<WebElement> trs = parent.findElements(By.tagName("tr"));
		System.out.println("Total number of 'tr' tags:  "+trs.size());
		for(WebElement tr : trs) { //Row iteration
			List<WebElement> tds = tr.findElements(By.tagName("td"));
			System.out.println("Total number of 'td' tags:  "+tds.size());
			for(WebElement td : tds) { //Cell Data iteration
				System.out.println(td.getText());
			}
			System.out.println("==================");
		}
		
		driver.quit();
	}
}
