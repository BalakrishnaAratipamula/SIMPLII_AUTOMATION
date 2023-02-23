package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX30_no_of_frames_framename {
public static void main(String[] args) {
	//to initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	driver.manage().window().maximize();
	
	//to find number of frames a page
	List<WebElement> frames =driver.findElements(By.tagName("frame"));
	System.out.println("Num of frame tags in a page is: "+frames.size());
	//to print frame
	for(WebElement frame: frames) {
		System.out.println(frame.getAttribute("name"));
	}
}
}
