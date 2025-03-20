package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EX52_DDDDDDynamic_elements { //--------------- https://youtu.be/c53R_9HauhU
	@Test
	public void HandleDynamicElements() throws InterruptedException {
		// to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();

		//1. to handle dynamic table	
		getCellValue(driver, 2, 2); //driver, row, column

		//2. to handle dynamic Links
		getTabName(driver, "Insurance Project");

		driver.quit();
	}

	//1.
	static void getCellValue(WebDriver driver, int row, int column) {
		String innerText = driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+column+"]")).getText();
		System.out.println("cell text is:  "+innerText);

	} //*/

	//2.
	static void getTabName(WebDriver driver, String tabName) throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'" + tabName + "')]")).click();
		Thread.sleep(2000);
		System.out.println("Window Page Title is:  " + driver.getTitle());
	} //*/

}
