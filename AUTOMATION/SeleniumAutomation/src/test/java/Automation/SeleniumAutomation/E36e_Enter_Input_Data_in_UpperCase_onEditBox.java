package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36e_Enter_Input_Data_in_UpperCase_onEditBox {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//'Search box' ele
		WebElement searchBox = driver.findElement(By.cssSelector("[name='field-keywords']"));	
		
		//creating obj for ACtions class
		Actions act = new Actions(driver);
		//Input data enter in upper case 
		act.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("dddddddddddddddddddd").keyUp(Keys.SHIFT).perform(); //keyDown() - to press the key, keyUp() - to release the key 

		Thread.sleep(5000);
		driver.quit(); 
	}
}
