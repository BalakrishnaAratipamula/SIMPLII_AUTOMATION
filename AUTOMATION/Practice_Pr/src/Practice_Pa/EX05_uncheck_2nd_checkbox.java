package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX05_uncheck_2nd_checkbox {
public static void main(String[] args) throws Exception {
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		//to uncheck 2nd checkbox
		driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click();
		Thread.sleep(1800);
		driver.close();
		
	}
}
