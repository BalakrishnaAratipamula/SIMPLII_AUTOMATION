package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E28_FileUpload_using_RobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Select WORD files")).click();
		Thread.sleep(10000);
		
		//store the file path in StringSelection class variable
		StringSelection filePath = new StringSelection("F:\\Robot Class Practice\\Simple.docx");
		//Copy the file path into System Clip board (Sytem clip board is nothing but a computer memory it will get store in RAM or ROM)
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(filePath, null);
		Thread.sleep(2000);
		
		//creating object for Robot class
		Robot rbt = new Robot();
		
		//pate : ctrl+v
		//pressing key events
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		
		//Releasing key events
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		//perform Tab activity
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		//perform Tab activity
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		//perform Enter activity
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		//validating whether right file is selected or not
		String fileNameText = driver.findElement(By.cssSelector(".file__info__name")).getText();
		String actualFileName = "Simple.docx";
		if(fileNameText.trim().equals(actualFileName))
			System.out.println("*****File uploaded successfully****");
		else
			System.out.println("*****File doesn't uploaded****");
		

		Thread.sleep(5000);
		driver.quit();
	}
}
