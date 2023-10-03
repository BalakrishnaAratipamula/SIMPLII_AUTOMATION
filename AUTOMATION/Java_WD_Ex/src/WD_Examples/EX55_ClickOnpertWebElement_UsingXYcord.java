/////	https://www.scientecheasy.com/2020/07/click-on-webelement.html/

package WD_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class EX55_ClickOnpertWebElement_UsingXYcord {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http:\\www.google.com"); 
		driver.manage().window().maximize(); 
		
		WebElement elm = driver.findElement(By.xpath("//a[text()=’Gmail’]"));
		
		int NumberX = elm.getLocation().getX(); 	 
		int NumberY = elm.getLocation().getY(); 
		
		Actions act= new Actions(driver); 
		act.moveByOffset(NumberX+1, NumberY+1).click().build().perform(); 	//(or) NumberY
		
///////////Its completely depends upon the screen resolution. It SR is changed this approach may not works////////////
		
	}
}
