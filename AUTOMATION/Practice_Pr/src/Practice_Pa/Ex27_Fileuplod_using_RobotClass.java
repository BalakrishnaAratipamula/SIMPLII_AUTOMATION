package Practice_Pa;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex27_Fileuplod_using_RobotClass {
public static void main(String[] args) throws Exception {
	//To initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.filemail.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//to enter To mail id
	driver.findElement(By.xpath("//li[@class='tagit-new']/input[1]")).sendKeys("bhanu10205@gmail.com");
	//to enter Subject
	driver.findElement(By.id("FilemailSubject")).sendKeys("uploading file using selenium by Robot class");
	//to click on "addBtn"
	driver.findElement(By.id("addBtn")).click();
	Thread.sleep(5000);
	
	//To String Select 'path'
	StringSelection myFile = new StringSelection("F:\\screenshot.png");
	//To copy and maintain it in system clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myFile, myFile);
	
	//Create obj for Robot class
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	//to release keys
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	
	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);

	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
}
}
