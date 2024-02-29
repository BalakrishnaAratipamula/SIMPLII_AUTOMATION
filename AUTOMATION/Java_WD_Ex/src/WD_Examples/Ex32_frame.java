//Write script to automate netbanking transaction in hdfbank netbanking  page
package WD_Examples;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex32_frame {
	public static void main(String[] args)throws Exception {
		//to initialize the browser
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		//to find number of Frames in a page
		List<WebElement> totalframes = driver.findElements(By.tagName("frame")); //(or) tagName("iframe") 
		System.out.println("Number of frames are: "+totalframes.size());

		//switch to frame
		driver.switchTo().frame("login_page");//while working with frames to navigate which frame u can enter
		//to click on continue
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		Thread.sleep(3000);

		//to read msg from alt
		Alert alt = driver.switchTo().alert();
		System.out.println("aler msg:   "+alt.getText());
		alt.accept();
		driver.findElement(By.name("fldLoginUserId")).sendKeys("4567");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.quit();
	}

}



