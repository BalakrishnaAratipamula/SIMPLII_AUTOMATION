package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX10c2_GenericFun_to_Handle_StaticDD2 {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(800);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)"); // horizantal, vertical
		Thread.sleep(800);

		driver.findElement(By.name("country")).click();
		Thread.sleep(800);
		
		//////Generic function to handle Static Drop down
//		dropdownValue(By.name("country"), "index", "4");
//		dropdownValue(By.name("country"), "value", "ANTIGUA AND BARBUDA");
		dropdownValue(By.name("country"), "visibletext", "CAYMAN ISLANDS");

		Thread.sleep(5000);

		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void dropdownValue(By locator, String type, String value) {
		Select select = new Select(getElement(locator));

		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value)); // conv String to int
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("please pass the selection criteria...");
			break;
		}
	}
}