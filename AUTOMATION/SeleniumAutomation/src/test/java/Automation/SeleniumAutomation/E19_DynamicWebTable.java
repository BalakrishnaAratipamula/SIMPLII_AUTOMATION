package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E19_DynamicWebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testuserautomation.github.io/WebTable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		String beforePart = "//table/tbody/tr[";
		String afterPart = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowSize = rows.size();
		System.out.println(rowSize);
		
		for(int i=2; i<=rowSize; i++) {
			//to get cell data text
			String firstName = driver.findElement(By.xpath(beforePart+ i +afterPart)).getText();
			System.out.println(firstName);
			if(firstName.contains("Will")) {
				//to click on desired check box
				driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/input")).click(); 
				System.out.println("----Done----");
				break;
			}
			else {
				System.out.println("User text does not exist");
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
