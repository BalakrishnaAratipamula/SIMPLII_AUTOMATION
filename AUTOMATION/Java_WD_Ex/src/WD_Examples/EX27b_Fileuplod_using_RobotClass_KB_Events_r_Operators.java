//create script to upload file in https://www.filemail.com/ application using Robot class
package WD_Examples;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX27b_Fileuplod_using_RobotClass_KB_Events_r_Operators {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf"); //https://www.filemail.com/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//click on select word files
		driver.findElement(By.linkText("Select WORD files")).click();		
		Thread.sleep(10000);
		
		// to Select String i.e. path of file "F:\\dd.jpg"
		StringSelection filePath = new StringSelection("F:\\API FileUpload\\SimpleWord.docx");
		// to copy & maintain it in system clipboard
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents("F:\\API FileUpload\\SimpleWord.docx", null); // or we have to declare 'filePath' also
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(filePath, null);
		// Create obj for Robot class //setContents - the transferable object representing the clipboard content
		Robot rbt = new Robot();
		
		// paste : ctrl+V
		rbt.keyPress(KeyEvent.VK_CONTROL); //VK_anyKeyWeWant
		rbt.keyPress(KeyEvent.VK_V);
		// to release keys
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(6000);
		//to get uploaded file info name
		String fileInfoName = driver.findElement(By.cssSelector(".file__info__name")).getText();
		if(fileInfoName.equals("SimpleWord.docx"))
			System.out.println("**** file uploades sucessfully ****"); 
		else
			System.out.println("**** file doesn't uploades sucessfully ****");
		
		
		Thread.sleep(1000);
		driver.quit(); //*/
		
		
		
		
		/*/ old script - //https://www.filemail.com/
		
		WebElement ShareOption = driver.findElement(By.xpath("//span[contains(text(),'Share')]"));
		Thread.sleep(4000);

		Actions act = new Actions(driver);
		// to perform mouseHover operation
		act.moveToElement(ShareOption).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Upload File")).click();
		Thread.sleep(4000);

		driver.findElement(By.id("FilemailMessageToURL")).sendKeys("uploading file using selenium by Robot class");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='addBtn']")).click();

		// to Select String i.e. path of file "F:\\dd.jpg"
		StringSelection filePath = new StringSelection("F:\\dd.jpg");
		// to copy & maintain it in system clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);// or we have to declare 'filePath' also
		
		// Create obj for Robot class //setContents - the transferable object representing the clipboard content
		Robot rbt = new Robot();
		
		// paste : ctrl+V
		rbt.keyPress(KeyEvent.VK_CONTROL); //VK_anyKeyWeWant
		rbt.keyPress(KeyEvent.VK_V);
		// to release keys
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("**** file uploades sucessfully ****"); //*/
		
	}
}
