package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX79b_ValidatePresentsOfAnElement_by_Using_isDiplayed_Mtd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
		    WebElement element = driver.findElement(By.id("elementId"));
		    if (element.isDisplayed()) {
		        System.out.println("Element is visible on the page.");
		    } else {
		        System.out.println("Element is in DOM but not visible.");
		    }
		} catch (NoSuchElementException e) {
		    System.out.println("Element is NOT present in DOM.");
		}
	}
}
