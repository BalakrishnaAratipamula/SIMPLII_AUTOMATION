package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX10b_StaticDD {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement option1 = driver.findElement(By.cssSelector("option[value='1']"));
		WebElement option2 = driver.findElement(By.cssSelector("option[value='2']"));
		
		Thread.sleep(5000);
		option1.click();
		Thread.sleep(5000);
		
		Assert.assertTrue(option1.isSelected());
		Assert.assertFalse(option2.isSelected());
		
		driver.quit();
	}
}
