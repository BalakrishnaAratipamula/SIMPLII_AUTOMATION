package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.Iterator;

public class EX33_Read_pagetitle_on_multiple_windows {
public static void main(String[] args) throws Exception {
	// To initialize browser
	System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http:\\gmail.com");
	driver.manage().window().maximize();
	//to read page Title
	String pgTitle = driver.getTitle();
	System.out.println("1st Page Title is:  "+pgTitle);
	//to click on "Help" link
	driver.findElement(By.linkText("Help")).click();
	Thread.sleep(5000);
	
	//to read window handles
	Set<String> pgHandles = driver.getWindowHandles();//it will return window handles of all opened windows into 'Set class' & this method return type is 'Set<String>'
	Object popup[] = pgHandles.toArray();
	Iterator<String> windowHandles = pgHandles.iterator();//it will read each window handles from 'Set class'
	//Read each 'window handle value' into 'variable' using iterator class
	String w1 = windowHandles.next();
	String w2 = windowHandles.next();
	System.out.println(w1);
	System.out.println(w2);
	
	//to work on 2nd window
	driver.switchTo().window(w2);
	String pgTitle2=driver.getTitle();
	System.out.println("2nd Page Title is:  "+pgTitle2);
	
	
}
}
