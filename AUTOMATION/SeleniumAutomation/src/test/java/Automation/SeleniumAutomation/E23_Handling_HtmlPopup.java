package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E23_Handling_HtmlPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//click on 'Multicity'
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_TripPlanner")).click();
		Thread.sleep(2000);
		
		//click on '[OK]' button in popup  //Html popups can handle by using XPath
		driver.findElement(By.xpath("//input[@type='button' and @value='Ok']")).click();
		System.out.println("HTML popup get handled with XPath");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
