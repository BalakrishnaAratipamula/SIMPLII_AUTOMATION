package Automation.SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4d_SelectAllCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//to find the number of check boxes 
		List<WebElement> checkBoxes = driver.findElements(By.name("Checkbox")); //'name' is common for all check boxes
		System.out.println(checkBoxes.size());
		
		//to check the unchecked check boxes --- here my motive is to check all the check boxes
		for(WebElement checkBox: checkBoxes) {
			if(!checkBox.isSelected()) { //(or) checkBox.isSelected()==false
				checkBox.click();
			}
		}
		System.out.println("Clicked all checkboxes");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
