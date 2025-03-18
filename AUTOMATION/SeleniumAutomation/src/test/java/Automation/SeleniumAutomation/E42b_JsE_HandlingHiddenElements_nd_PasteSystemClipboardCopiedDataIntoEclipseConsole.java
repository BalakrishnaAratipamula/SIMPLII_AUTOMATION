package Automation.SeleniumAutomation;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E42b_JsE_HandlingHiddenElements_nd_PasteSystemClipboardCopiedDataIntoEclipseConsole {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException, HeadlessException, UnsupportedFlavorException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*/Execution 1: Here we are not handling any hidden elements but we are trying to enter the text in EditBox
		try {
			driver.findElement(By.id("hide-textbox")).click(); //clicked on [Hide]
			driver.findElement(By.id("displayed-text")).sendKeys("AAAAAAAA"); //EditBox 
		} catch(ElementNotInteractableException e) {
			e.printStackTrace();
			genericMethodToCopyTextIntoSystemClipboardAndPasteIntoConsole();
		} //*/
		
		
		//Execution 2: Here we are handling the hidden elements using JsE
		driver.findElement(By.id("hide-textbox")).click(); //clicked on [Hide]
		
		//to handle Hidden elements
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.document.getElementById('displayed-text').value='AAAAAAAA'");
		
		genericMethodToCopyTextIntoSystemClipboardAndPasteIntoConsole(); //*/
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	// Entered text is not present on the element node inside the DOM so we have to use below process
	// GenericMethodToCopyTextIntoSystemClipboardAndPasteIntoConsole 
	public static void genericMethodToCopyTextIntoSystemClipboardAndPasteIntoConsole() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click(); //clicked on [Show]
		driver.findElement(By.id("displayed-text")).click(); //clicked on 'Edit Box'
		driver.findElement(By.id("displayed-text")).sendKeys(Keys.SPACE); //adding 'space' to editbox text
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyUp(Keys.CONTROL).perform(); //ctrl+a
		act.keyDown(Keys.CONTROL).keyDown("c").keyUp("c").keyUp(Keys.CONTROL).perform(); //ctrl+c
		
		//After copying the String content that String content will store in system clip board we will try to capture that content and print in console
		//to capture data from system clip board
		String textInEditBox = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		//print the captured data
		System.out.println("Text in EditBox:  "+textInEditBox);
	}
}
