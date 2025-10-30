package WD_Examples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX83_color_front_position {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/register");
		WebElement element = driver.findElement(By.id("elementld"));
		String color = element.getCssValue("color");
		String font = element.getCssValue("font-family");
		Point position = element.getLocation();
		assertEquals("expectedColor", color);
		assertEquals("expectedFont", font);
//		assertEquals(new Point(expectedX, expectedY), position); //Validation
	}
}
