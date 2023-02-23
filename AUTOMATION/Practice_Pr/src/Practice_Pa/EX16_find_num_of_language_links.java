package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX16_find_num_of_language_links {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.co.in");
	driver.manage().window().maximize();
	
	WebElement myLanguages=driver.findElement(By.id("SIvCob"));
	
	List<WebElement> links=myLanguages.findElements(By.tagName("a"));
	System.out.println("Num of language links are: "+links.size());
}
}
