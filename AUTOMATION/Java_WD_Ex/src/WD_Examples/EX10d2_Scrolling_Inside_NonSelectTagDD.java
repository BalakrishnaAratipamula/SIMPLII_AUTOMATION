package WD_Examples;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EX10d2_Scrolling_Inside_NonSelectTagDD {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/code360/library/handling-dropdowns"); // https://accounts.google.com/
		driver.manage().window().maximize();
		Thread.sleep(9000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='heading font-class']"));
		ele.click();
		Thread.sleep(9000);
		
		WebElement target = driver.findElement(By.xpath("//div[contains(text(),'Maven')]")); ////div[contains(text(),'Java')]
		new Actions(driver).scrollToElement(target).perform();
		Thread.sleep(5000);
		target.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
