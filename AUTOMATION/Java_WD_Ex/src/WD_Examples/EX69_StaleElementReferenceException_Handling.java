package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX69_StaleElementReferenceException_Handling {
	public static void main(String[] args) { 
		WebDriver driver = new ChromeDriver();
		for (int i = 0; i < 3; i++) {
			try {
				WebElement element = driver.findElement(By.id("elementID"));
				driver.get("****************************");
				element.click();
				break; // Break loop if interaction is successful
			} catch (StaleElementReferenceException e) {
				System.out.println("Stale element encountered, retrying...");
			}
		}
	}
}
