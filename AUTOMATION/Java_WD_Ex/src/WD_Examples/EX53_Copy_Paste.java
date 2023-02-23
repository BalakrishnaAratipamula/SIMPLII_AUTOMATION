package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX53_Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("Himaja");
		Thread.sleep(3000);
		
		//to handle keyboard events
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //perform 'ctrl+a' activity
		Thread.sleep(3000);
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); //perform 'ctrl+c' activity
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB).build().perform(); //perform 'tab' activity
		Thread.sleep(3000);
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform(); //perform 'ctrl+v' activity
		Thread.sleep(5000);

		driver.quit();


	}

}
