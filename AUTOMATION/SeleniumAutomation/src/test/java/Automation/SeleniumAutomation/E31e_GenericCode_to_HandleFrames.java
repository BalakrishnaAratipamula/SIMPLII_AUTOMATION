package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E31e_GenericCode_to_HandleFrames {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Generic code to handle the Frames
		try{
			//click on continue button
			driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
			System.out.println("Element is found outside the frame...");
		} catch(NoSuchElementException ex1){
			//to find number of frames in a page
			List<WebElement> frames_ = driver.findElements(By.tagName("frame")); 
			System.out.println("Number of frames are:  "+frames_.size()); 
			
			//iterate each frame
			for(WebElement frame_ : frames_) {
//				System.out.println(frame_);
				driver.switchTo().frame(frame_); //switch each and every frame
				try { //this try block is used: if ele is not present in iterating frames we don't get the exception and go with next iteration smmothly
					//clicking on continue buttion
					driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
					System.out.println("Element found inside frame!");
					Thread.sleep(3000);
					
					//To handle the alert after clicking on 'continue' btn
					Alert alert = driver.switchTo().alert();
					System.out.println("Alert message:  "+alert.getText());
					alert.accept();
					
					//Entering some text in 'Customer ID/ User ID' edit box
					driver.findElement(By.name("fldLoginUserId")).sendKeys("123456789");
					
					//Return to main page
					driver.switchTo().defaultContent();
					
					System.out.println("I'm inside the main page");
					
					break;
				}catch(NoSuchElementException ex2) {
					//Return to main page
					driver.switchTo().defaultContent();
				}
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
