package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EX52_DDDDDDynamic_elements { //--------------- https://youtu.be/c53R_9HauhU
	@Test
	public void HandleDynamicElements() {
		// to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();

		//1. to handle dynamic table	
		getCellValue(driver, 2, 2); //driver, row, column

		//2. to handle dynamic Links
		//getTabName(driver, "Insurance Project");

		driver.quit();
	}

	//1.
	public void getCellValue(WebDriver driver, int row, int column) {
		String innerText = driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+column+"]")).getText();
		System.out.println("cell text is:  "+innerText);

	} 

	/*/2.
	public void getTabName(WebDriver driver, String tabname) {
		String tabNameEle = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'"+tabname+"')]")).getText();
		System.out.println("Tab name is:  "+tabNameEle);
	} */

}
