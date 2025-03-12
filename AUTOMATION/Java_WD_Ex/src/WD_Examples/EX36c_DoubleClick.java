package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EX36c_DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		// Retrieve WebElement to perform double click WebElement
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn"));

		// Double Click the button
		actions.doubleClick(btnElement).perform();

		System.out.println("Button is double clicked");

		String confirmationMsg = driver.findElement(By.xpath("//*[text()='Buttons']//parent::div/p")).getText();
		System.out.println("Confirmation Msg:  "+confirmationMsg);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
