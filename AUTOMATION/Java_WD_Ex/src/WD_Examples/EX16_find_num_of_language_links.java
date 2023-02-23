package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX16_find_num_of_language_links {
	public static void main(String[] args) {
		// to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		driver.manage().window().maximize();

		//Requirement is only language links so we have to create reference object for Parent tag
		WebElement parent = driver.findElement(By.id("SIvCob"));//id("SIvCob")---available in parent tag
		//to get links information
		List<WebElement> links = parent.findElements(By.tagName("a")); //tagName 'a' is common for all links
		System.out.println("num of language links are: "+links.size());

		//to print languages-----display ????? only
		for(int i=0; i<=links.size()-1; i++) {
			String str = links.get(i).getText();
			System.out.println(str);
		}
	}
}
