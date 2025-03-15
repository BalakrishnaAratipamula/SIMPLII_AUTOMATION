package WD_Examples;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX43_JsE_HandlingHiddenElements_nd_PasteSytemClipboardCopiedDataIntoEclipseConsole { 
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception { /////--------------https://youtu.be/2O5tnsJaHrY

		///////while handling hidden elements we will get ElementNotVisible & ElementNotInteractable Exceptions & sometimes will not get error

		// to initialize browser
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Execution 1. at this time given text will not enter in text box (it can see by click [show] after executing the script)
		driver.findElement(By.id("hide-textbox")).click(); //Hide button is clicked
		driver.findElement(By.id("hide-textbox")).sendKeys("AAAAAA"); 
		
		genericMethodToCopyTextIntoSystemClipBoardAndPastIntoConsole(); //*/
		
		/*/Execution 2. at this time given text will enter in text box (it can see by click [show] after executing the script)
		driver.findElement(By.id("hide-textbox")).click(); //click on [Hide] 
		//creating JavascriptExecutor interface object by TypeCasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.document.getElementById('displayed-text').value='AAAAAA'"); 
		
		genericMethodToCopyTextIntoSystemClipBoardAndPastIntoConsole(); //*/
		
		Thread.sleep(5000);
		driver.quit();
	}

	//genericMethodToCopyTextIntoSystemClipBoardAndPastIntoEclipseConsole
	public static void genericMethodToCopyTextIntoSystemClipBoardAndPastIntoConsole() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click(); // click on [Show]
		driver.findElement(By.cssSelector("[name='show-hide']")).click(); // click on 'Edit Box'
		driver.findElement(By.cssSelector("[name='show-hide']")).sendKeys(Keys.SPACE); //In case text/space is not there in editbox nothing will copy to SystemClipBoard so will print already (previous) copied one in console 
																						//so i'm filling one 'space' in editbox  
		// using Actions class bcz i'm unable to capturing the text from 'Edit Box' bcz
		// entered text is not showing in DOM attribute values
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).keyDown("c").keyUp("c").keyUp(Keys.CONTROL).perform();
		String textInEditbox = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println("Text in Editbox:  " + textInEditbox);
		
		/*/ instead of using above keyDOwn(), keyUp() try below send keys approach (actually i didn't tried just try once)
		e.sendKeys(Keys.COMMAND, "a"); //all
		e.sendKeys(Keys.COMMAND, "c"); //copy
		s.sendKeys(Keys.COMMAND, "v"); //paste
		//*/
	}
}


