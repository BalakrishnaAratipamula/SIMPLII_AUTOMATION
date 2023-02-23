//Write program to handle java popup in https://aponline.gov.in Application
package WD_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX26_Java_Popups {
	public static void main(String[] args) throws Exception{
		//open Chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://onlineap.meeseva.gov.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize();

		driver.findElement(By.name("userId")).sendKeys("AAAAAAAA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnsubmit']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		System.out.println("error msg from popup window is:    "+msg);

		alt.accept();

		//to enter text in popup window text box
		//alt.sendKeys("===>text");

		Thread.sleep(2000);
		driver.findElement(By.name("userId")).clear();
		driver.findElement(By.name("userId")).sendKeys("BBBBBBBBB"); 
		
		driver.quit();

	}
}
