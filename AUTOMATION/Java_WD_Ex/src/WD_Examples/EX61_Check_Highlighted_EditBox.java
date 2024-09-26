package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EX61_Check_Highlighted_EditBox {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.cypress.io/commands/actions");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.cssSelector(".action-focus"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(1000);

		Assert.assertTrue(driver.findElement(By.xpath("//*[@for='password1']")).getAttribute("style").contains("color: orange;"));
		
		driver.quit();
		
	}
}
