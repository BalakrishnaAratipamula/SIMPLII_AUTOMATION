package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EX38c_mousehover_tr {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://extentreports.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Docs']"));
		Thread.sleep(2000);
		act.moveToElement(ele).build().perform();

		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Version 4']"));
		Thread.sleep(2000);
		act.moveToElement(ele2).build().perform();

		driver.findElement(By.xpath("(//*[@class='menu-vertical'])[3]/li/a[text()='Klov']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
