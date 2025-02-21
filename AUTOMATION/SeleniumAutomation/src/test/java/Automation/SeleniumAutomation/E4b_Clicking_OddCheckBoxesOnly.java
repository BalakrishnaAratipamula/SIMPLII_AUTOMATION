package Automation.SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4b_Clicking_OddCheckBoxesOnly {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		//'Multi Selection' drop down
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(1000);
		//to find the number of check boxes 
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//ul/li/span[@class='comboTreeItemTitle']")); //taken XPath is common for all checkboxes
		System.out.println(checkBoxes.size());
		
		//All check boxes common element
		int i=0; //because index will start from 'zero'
		for(int j=1; j<checkBoxes.size(); j++) { //iterate till 'size' and apply 'break' once i reached my desired point
			String AllCheckBoxes = checkBoxes.get(i).getText(); //to get check box names
			System.out.println(AllCheckBoxes); //to print all check box names
			if(AllCheckBoxes.isEmpty()) //If element is not present perform break (bcz size is 45 here i want to check 15 out of 45 only)
				break;
			if(j%2 != 0) { //to click only 'odd' check boxes
				checkBoxes.get(i).click(); //clicking only odd check boxes 
				Thread.sleep(300);
			}
			i++; //increment the index value every time
		} //*/
		System.out.println("All odd checkboxes get clicked");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
