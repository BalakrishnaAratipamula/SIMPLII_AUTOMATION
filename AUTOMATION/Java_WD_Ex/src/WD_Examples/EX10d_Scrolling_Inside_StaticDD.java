package WD_Examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EX10d_Scrolling_Inside_StaticDD {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://demo.guru99.com/test/newtours/"); //https://accounts.google.com/
//		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(800);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)"); // horizantal, vertical
		Thread.sleep(800);

		WebElement ele = driver.findElement(By.name("country"));
		ele.click();
		Thread.sleep(800);

		String optionText = "GERMANY";
//		ele.sendKeys(Keys.PAGE_DOWN);
		WebElement target = driver.findElement(By.xpath("//select[@name='country']/option[text()='"+optionText+"']"));
//		driver.findElement(By.xpath("//div[@class='VfPpkd-aPP78e']")).click();
		Thread.sleep(5000);
		
//		WebElement target = driver.findElement(By.xpath("//ul/li[62]"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
