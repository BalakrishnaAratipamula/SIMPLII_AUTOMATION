//Write script to check "Register" link available or not in Mercury tours home page, if that link exist then need to click on that link
package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX15_Link_available_r_not {
public static void main(String[] args) {
	
	boolean myStatus = false;
	
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	
	List<WebElement> links = driver.findElements(By.tagName("a"));

	/*for(WebElement link: links) {
		String lnk = link.getText();
		if(lnk.equalsIgnoreCase("Register")) {
			link.click();
			System.out.println("Given link is available");
			myLink = true;
			break;
		}
	}*/
	for(int i=0; i<=links.size()-1; i++) {
		String lnk = links.get(i).getText();
		if(lnk.equalsIgnoreCase("Register2")) {
			links.get(i).click();
			System.out.println("Given link is available");
			myStatus = true;
			break;
		}
	}
	if(myStatus==false) {
		System.out.println("Given link is not available");
	}
}
}
