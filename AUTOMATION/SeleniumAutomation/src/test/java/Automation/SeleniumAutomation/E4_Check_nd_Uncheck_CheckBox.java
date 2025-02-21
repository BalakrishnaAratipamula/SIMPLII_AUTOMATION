package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4_Check_nd_Uncheck_CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		//'Remember me' element
		WebElement checkBoxEle = driver.findElement(By.cssSelector("[name='rememberUn']"));
		Thread.sleep(5000);
		//M1 - Check the check box
		checkBoxEle.click(); //to perform click ACtivity
		//M2
//		checkBoxEle.sendKeys(Keys.ENTER); //to perform Enter ACtivity
		//M3
//		checkBoxEle.submit(); //to perform Enter ACtivity
		
		Thread.sleep(5000);
		//Un-check the check box
		checkBoxEle.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
