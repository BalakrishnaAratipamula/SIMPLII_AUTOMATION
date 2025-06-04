package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EX39f_PassTestData_InsteadOfSendKeysMtd_usingActionsClass {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		Thread.sleep(1000);

		WebElement googleSearch = driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);

		Action action = act.keyDown(googleSearch, Keys.SHIFT)
				.sendKeys("selenium")
				.keyUp(googleSearch, Keys.SHIFT)
				.keyDown(googleSearch, Keys.CONTROL)
				.sendKeys("a")
				.keyDown(googleSearch, Keys.CONTROL)
				.sendKeys("x")
				.pause(5000)
				.keyDown(googleSearch, Keys.CONTROL)
				.sendKeys("v")
				.build();
		action.perform();

		Thread.sleep(3000);

		driver.quit();
	}
}
