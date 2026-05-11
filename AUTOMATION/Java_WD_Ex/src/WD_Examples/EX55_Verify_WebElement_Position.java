package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX55_Verify_WebElement_Position {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("submit"));
		
		/*/1. Using getLocation()
		Point location = element.getLocation();

		int x = location.getX();
		int y = location.getY();

		System.out.println("X position: " + x);
		System.out.println("Y position: " + y);
		
		Assert.assertEquals(location.getX(), 200);
		Assert.assertEquals(location.getY(), 400); //*/
		
		//2. Using getRect() (Modern Approach)
		Rectangle rect = element.getRect();

		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
	}
}
