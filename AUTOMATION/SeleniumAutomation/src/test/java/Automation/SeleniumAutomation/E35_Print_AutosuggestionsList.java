package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E35_Print_AutosuggestionsList {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//search button
		WebElement txtSearch = driver.findElement(By.cssSelector("[name='q']"));
		txtSearch.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']")); //(or) //ul[@role='listbox']/li/div/div[2]/div/div[@class='wM6W7d']
		//descendant XPath axis: is used to select all descendant nodes (i.e., child, grandchild (child-of-child)) of current node
		System.out.println("Total number of Autosuggestions:  "+list.size());
		
		//print the Autosuggestions
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			//I want to click on one of the desired Autosuggestion
			if(list.get(i).getText().contains("download")) {
				list.get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit(); 
	}
}
