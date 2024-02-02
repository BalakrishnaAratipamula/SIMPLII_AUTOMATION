/////	https://www.scientecheasy.com/2020/07/click-on-webelement.html/

package WD_Examples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX55_ClickOnpertWebElement_UsingXYcord {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http:\\www.google.com"); 
		driver.manage().window().maximize(); 
		
		WebElement elm = driver.findElement(By.xpath("//a[text()=’Gmail’]"));
		
		int NumberX = elm.getLocation().getX(); 	 
		int NumberY = elm.getLocation().getY();
		
		System.out.println("NumberX Value:  " +NumberX);
		System.out.println("NumberY Value:  " +NumberY);
		
		Actions act= new Actions(driver); 
		act.moveByOffset(NumberX+1, NumberY+1).click().build().perform(); 	//(or) NumberY
		
///////////Its completely depends upon the screen resolution. If SR is changed this approach may not works////////////
		
	}
}

