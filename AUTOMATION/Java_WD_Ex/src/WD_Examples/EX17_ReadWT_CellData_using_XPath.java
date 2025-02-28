//Write program to read data from 2nd row of 3rd column from Web table
package WD_Examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class EX17_ReadWT_CellData_using_XPath {
	public static void main(String[] args) {
		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		//to read 2nd row & 3rd coloum cell data
		/*WebElement celldata = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		System.out.println(celldata.getText());*/
		//or
		String celldata = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[position()=2]/td[3]")).getText();
		System.out.println(celldata);


		//to read 7th row & 2nd coloum cell data
		String celldata2 = driver.findElement(By.xpath("//td[contains(text(),'Giovanni Rovelli')]")).getText();
		System.out.println(celldata2);
	}
}
