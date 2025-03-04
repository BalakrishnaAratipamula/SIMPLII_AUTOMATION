package WD_Examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EX01d_BrowserCmds_setWinPositionNdSize_getWEleSizeNdLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		
		//set window size
		Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		
		//set window position
		Point pt = new Point(250, 250);
		driver.manage().window().setPosition(pt);
		Thread.sleep(2000);
		
		//maximize bowser window
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//set WebElement 'size' and 'location' for 'Email or phone number' edit box
		WebElement ele = driver.findElement(By.cssSelector("[name='email']"));
		System.out.println("size: "+ele.getSize()+" \nlocation: "+ele.getLocation());
		//set WebElement 'size' and 'location' for 'Login' button
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Log in']"));
		System.out.println("size: "+ele2.getSize()+" \nlocation: "+ele2.getLocation());
		
		driver.quit();
	}
}
