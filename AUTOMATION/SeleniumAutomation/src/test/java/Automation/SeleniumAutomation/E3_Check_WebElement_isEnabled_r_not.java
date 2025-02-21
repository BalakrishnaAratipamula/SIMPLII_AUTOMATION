package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3_Check_WebElement_isEnabled_r_not {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//'Create new account' button
		WebElement ele = driver.findElement(By.xpath("//*[text()='Create new account']"));
		
		String objVisibleText = ele.getText();
		System.out.println("Object Visible text is:  "+objVisibleText);
		
		//Before click on 'Create new account' button i want to check whether that element isEnabled or not 
		if(ele.isEnabled()) {
			System.out.println(objVisibleText+"  is Enabled");
			ele.click(); //to click on 'Create new account' button
		}
		else
			System.out.println(objVisibleText+"  is Disabled");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
