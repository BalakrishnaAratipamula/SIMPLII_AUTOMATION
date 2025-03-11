package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E31_Print_numberOf_Frames_In_aPage {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to find number of frames in a page
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe")); 
		System.out.println("Number of frames are:  "+totalFrames.size());
		
		//to reach frame name
		for(WebElement frame : totalFrames) {
			System.out.println(frame.getAttribute("name"));
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
