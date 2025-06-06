package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX38_mousehover {
	public static void main(String[] args) throws Exception {
		// To initialize browser
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement menuOption = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Thread.sleep(6000);

		Actions act= new Actions(driver);
		//to perform mouseHover operation
		act.moveToElement(menuOption).build().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Your Wish List')]")).click();
		Thread.sleep(3000);
		
		System.out.println("Window Page title:  "+driver.getTitle());
		System.out.println("-----Done----");
		driver.quit();

	}
}
