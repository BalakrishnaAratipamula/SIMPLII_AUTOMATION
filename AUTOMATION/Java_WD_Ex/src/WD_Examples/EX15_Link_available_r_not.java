//Write script to check "Register" link available or not in Mercury tours home page, if that link exist then need to click on that link
package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class EX15_Link_available_r_not {
	public static void main(String[] args) throws InterruptedException {

		boolean myStatus = false;//boolean values can always give t/f results 

		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		//to collecet links information create ref obj for addressing WebElements
		List<WebElement> links = driver.findElements(By.tagName("a"));

		//compare with given link & check given link is available or not by using 'for loop'
		for(int i=0; i<=links.size()-1; i++) {
			String str = links.get(i).getText();
			if(str.equalsIgnoreCase("Register")) {
				links.get(i).click();//when matched link while reading time can click() on that particular link & 'i' is index
				System.out.println("given link is available");
				myStatus = true;//if link gets match i.e true
				break;         //if link gets match i.e true need to stop iterations 
			}
		} 


		/*/compare with given link to check given link is available or not by using 'for-each loop'
		for(WebElement link: links) {
			String str = link.getText();//------>to read Text of links and this can store in 'b'
			if(str.equalsIgnoreCase("Register")) {
				link.click();    //when matched link while reading time can click() on that particular link
				System.out.println("given link is available");
				myStatus = true;//if link gets match 'myStatus' will going to 'true' and then take 'break'
				break;			
			}
		} */
		
		if(myStatus==false) {
			System.out.println("given link is not available");
		} 
		
		Thread.sleep(3500);
		driver.quit();
	}
}
