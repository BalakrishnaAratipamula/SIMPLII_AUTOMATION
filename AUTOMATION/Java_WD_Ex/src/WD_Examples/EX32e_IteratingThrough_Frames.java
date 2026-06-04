package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX32e_IteratingThrough_Frames {
	public static void main(String[] args) {
		// to initialize the browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		for (WebElement frame : frames) {

			driver.switchTo().frame(frame);

			if (driver.findElements(By.id("targetElement")).size() > 0) {
				System.out.println("Element found inside frame");
				break;
			}

			driver.switchTo().defaultContent();
		}
	}
}
