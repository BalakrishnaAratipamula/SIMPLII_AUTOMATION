package WD_Examples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX33a_Handling_Multiplewindows_M2 { //in this method first we have to now which window will open first
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

		int count = allwindows.size();
		System.out.println("total windows is:  "+count);

		//navigate to child windows
		for(String child: allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child window title is:  "+driver.getTitle());
				driver.findElement(By.name("q")).sendKeys("selenium webdriver");
				Thread.sleep(3000);

				driver.close();
			}
		}
		//navigate to parent window
		driver.switchTo().window(parent);
		System.out.println("parent window title is:  "+driver.getTitle()); 
		Thread.sleep(3000);
		driver.quit();



	}
}
