package WD_Examples;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX33b_Handling_Multiplewindows_M3 {
	public static void main(String[] args) throws InterruptedException {
		// To initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();

		String parent = driver.getWindowHandle();
		System.out.println("parent window id is:  "+parent);
		System.out.println("parent window title is:  "+driver.getTitle());

		//to click on " Click this link to start new Tab"
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();

		Set<String> allwindows = driver.getWindowHandles();

		ArrayList<String> tabs = new ArrayList<>(allwindows); //by passing arg - allwindows it will convert into ArrayList
		System.out.println("total num of windows:  "+tabs.size());
		//to navigate 2nd window
		driver.switchTo().window(tabs.get(1));
		System.out.println("child window title  :"+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		//to navigate 1st window 
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window title  :"+driver.getTitle());
		Thread.sleep(3000);

		driver.quit();


	}
}
