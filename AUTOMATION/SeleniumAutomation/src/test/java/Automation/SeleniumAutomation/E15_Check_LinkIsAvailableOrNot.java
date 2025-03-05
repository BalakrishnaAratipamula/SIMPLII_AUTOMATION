package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E15_Check_LinkIsAvailableOrNot {
	public static void main(String[] args) throws InterruptedException {
		Boolean myStatus = false;
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		
		//Capture all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:  "+links.size());
		
		String linkWeWantToCheck = "Register"; //Desired Link
		
		//check link is available or not
		for(int i = 0; i<=links.size()-1; i++) {
			String linkText = links.get(i).getText();
			if(linkText.equalsIgnoreCase(linkWeWantToCheck)) {
				System.out.println(linkWeWantToCheck+" linke is available");
				//click on 'Register' link
				links.get(i).click();
				System.out.println(linkWeWantToCheck+" linke is clicked");
				myStatus = true;
				break;
			}
		}
		if(myStatus == false) {
			System.out.println(linkWeWantToCheck+" linke is not available");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
