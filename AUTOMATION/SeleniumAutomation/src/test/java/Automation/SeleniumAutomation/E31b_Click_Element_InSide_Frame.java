package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E31b_Click_Element_InSide_Frame {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		
		//to find number of frames in a page
		List<WebElement> totalFrames = driver.findElements(By.tagName("frame")); 
		System.out.println("Number of frames are:  "+totalFrames.size()); 
		
		//Switch to frame
		driver.switchTo().frame("login_page"); //name 
		
		//click on continue button
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message:  "+alert.getText());
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
