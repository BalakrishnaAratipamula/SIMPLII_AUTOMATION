package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX79_ValidatePresentsOfAnElement_WO_Using_isDiplayed_Mtd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		List<WebElement> elements = driver.findElements(By.id("elementId"));

		if (elements.size() > 0) {
		    System.out.println("Element is present in DOM.");
		} else {
		    System.out.println("Element is NOT present in DOM.");
		}
	}
}
