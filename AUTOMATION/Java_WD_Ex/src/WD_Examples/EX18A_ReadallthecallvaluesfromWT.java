//Write script to read all the cell vales from WebTable
package WD_Examples;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EX18A_ReadallthecallvaluesfromWT {
	public static void main(String[] args) {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		//create reference obj for WebElement
		WebElement parent = driver.findElement(By.id("customers"));//id("customers") is parent of entire table----always starts with tagName--table


		//to print table header---------------------
		List<WebElement> ths = parent.findElements(By.tagName("th"));
		for(WebElement th : ths) {
			System.out.println(th.getText());
		}


		//to print table each cell data---------------------
		List<WebElement> tds = parent.findElements(By.tagName("td"));//tagName("td") is common for every cell in table
		for(WebElement td: tds) {
			System.out.println(td.getText());
		}

		driver.quit();
	}
}
