package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX18C_DDDDDDynamic_WebTable {
	public static void main(String[] args) throws InterruptedException {
		// to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testuserautomation.github.io/WebTable/");
		driver.manage().window().maximize();
		
		String before_XPath = "//table/tbody/tr[";
		String after_XPath = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		
		int rowSize = rows.size();
		System.out.println(rowSize);
		
		for(int i=2; i<=rowSize; i++) {
			String firstNames = driver.findElement(By.xpath(before_XPath+ i +after_XPath)).getText();
			System.out.println(firstNames);
			Thread.sleep(3000);
			
			if(firstNames.contains("Will")) {
				driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[1]/input")).click();
				System.out.println("----Checked----");
				break;
			}
			else {
				System.out.println("user text doesnot exist");
			}
		}
		Thread.sleep(2000);	
		driver.quit();
	}
}
