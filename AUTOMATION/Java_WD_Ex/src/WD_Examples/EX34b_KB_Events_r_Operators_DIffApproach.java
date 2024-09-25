package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX34b_KB_Events_r_Operators_DIffApproach {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.tagName("input"));
		ele.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN)
		   .pause(800)
		   .perform();
		String str = driver.findElement(By.xpath("//*[@class='example']/p[2]")).getText();
		System.out.println(str);
//		Thread.sleep(800);
		act.sendKeys(Keys.ARROW_UP)
		   .pause(800)
		   .perform();
		String str2 = driver.findElement(By.xpath("//*[@class='example']/p[2]")).getText();
		System.out.println(str2);
//		Thread.sleep(800);
		act.sendKeys(Keys.ARROW_RIGHT)
		   .pause(800);
		String str3 = driver.findElement(By.xpath("//*[@class='example']/p[2]")).getText();
		System.out.println(str3);
//		Thread.sleep(800);
		act.sendKeys(Keys.ARROW_LEFT)
		   .pause(800)
		   .perform();
		String str4 = driver.findElement(By.xpath("//*[@class='example']/p[2]")).getText();
		System.out.println(str4);
//		Thread.sleep(1000);
		
		driver.quit();
	}
}
