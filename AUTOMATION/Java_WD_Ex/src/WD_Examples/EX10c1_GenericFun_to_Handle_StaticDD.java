package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX10c1_GenericFun_to_Handle_StaticDD {
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
		//doSelectDDByVisibleText(By.name("country"), "ARMENIA");
		//doSelectDDByIndex(By.name("country"), 4);
		doSelectDDByValue(By.name("country"), "ANGUILLA");
		
		Thread.sleep(5000);
		 
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDDByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDDByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDDByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
}
