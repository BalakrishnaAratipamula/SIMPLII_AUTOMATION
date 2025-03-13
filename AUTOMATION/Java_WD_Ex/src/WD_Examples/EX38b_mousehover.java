package WD_Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class EX38b_mousehover {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//*[@class='figure']/img)[1]"));
		Thread.sleep(2000);
		act.moveToElement(ele).build().perform();
		
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'name: user1')]"));
		Assert.assertTrue(element.isDisplayed(), "user1 should appear bcz we hovered over the image");
		
		String str = driver.findElement(By.xpath("//*[@class='figcaption']/h5")).getText();
		System.out.println(str);
		
		Thread.sleep(1000);
		driver.quit();
	}
}
