package WD_Examples;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//::descendant Ex
public class EX34A_Print_AutoSuggetionsList {
	public static void main(String[] args) throws Exception {
		// To initialize browser
		WebDriver driver= new FirefoxDriver();
		driver.get("http:\\google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Create Reference object for Search editbox
		WebElement txtSearch=driver.findElement(By.name("q"));

		//to Handle google Search    -------------- https://youtu.be/6RaDZhfXHI8	
		txtSearch.sendKeys("java");		////below XPath is called dynamic customized XPath //(or)//ul[@role='listbox']//li/div/div[2]/div/div[@class='wM6W7d']
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']")); //////see above 
		////‘descendant’ - is used to select all descendant nodes (i.e., child, grandchild’s (c-o-c’s), etc) of current node 
		///// findElements bcz we have to work with multiple elements 
		///// //ul[@role='listbox'] - XPath for parent of suggestions
		///// double-slash or single-slash in mid of relative XPath (before 'li' tag) means total number of child elements 
		///// 'li' (child) bcz give me all the li's which are available in 'ul' (parent)
		///// descendant will give number of child's i.e., child, child-of-child, .......(if we want to jump directly into child or c-o-c we have to use descendant)
		///// my target to select 'div' thats why ::div
		///// @class='wM6W7d' - suggestion text
		System.out.println("total num of suggestions:   "+list.size());
		//to print all suggestions
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("questions")) { //if specify last option then only will print all suggested values otherwise will break at matching one
				list.get(i).click();
				break; //don't want to check other element
			}
		} 
		
		driver.quit();
	}
}
