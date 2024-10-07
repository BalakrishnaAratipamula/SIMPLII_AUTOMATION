package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX41d_FlashAnElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.linkText("Images"));
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.backgroundColor = 'yellow'", ele);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].style.backgroundColor = 'green'", ele);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].style.backgroundColor = 'Red'", ele);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].style.backgroundColor = ''", ele);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
