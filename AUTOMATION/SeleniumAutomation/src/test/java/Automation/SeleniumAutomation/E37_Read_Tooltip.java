package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E37_Read_Tooltip {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to read tooltip of 'Sign in'
		String toolTipText1 = driver.findElement(By.linkText("Sign in")).getAttribute("title");
		System.out.println("Tooltip of 'Sign in' link is:  "+toolTipText1);
		
		//to read tooltip of 'Create Account'
		String toolTipText2 = driver.findElement(By.linkText("Create Account")).getAttribute("title");
		System.out.println("Tooltip of 'Create Account' link is:  "+toolTipText2);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
