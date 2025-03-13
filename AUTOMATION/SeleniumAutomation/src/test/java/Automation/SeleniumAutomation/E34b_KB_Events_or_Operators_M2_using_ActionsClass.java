package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E34b_KB_Events_or_Operators_M2_using_ActionsClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//clicking on 'target' field search box
		driver.findElement(By.tagName("input")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).pause(800).perform(); //perform() is used to execute the sequence of steps/methods in a line of code
		WebElement textEle = driver.findElement(By.xpath("//*[@class='example']/p[2]"));
		System.out.println(textEle.getText());
		act.sendKeys(Keys.ARROW_RIGHT).pause(800).perform();
		System.out.println(textEle.getText());
		act.sendKeys(Keys.ARROW_LEFT).pause(800).perform();
		System.out.println(textEle.getText());
		act.sendKeys(Keys.ARROW_UP).pause(800).perform();
		System.out.println(textEle.getText());
		
		Thread.sleep(5000);
		driver.quit(); 
	}
}
