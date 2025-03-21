package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX27c_Fileuplod_using_sendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://blueimp.github.io/jQuery-File-Upload/"); //Exec 1
		driver.get("https://www.selenium.dev/selenium/web/upload.html"); //Exec 2
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		/*/'Add Files'
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']")); //*///Exec 1
		
		//'Choose Files'
		WebElement ele = driver.findElement(By.id("upload")); //*///Exec 2 //(or) //input[@type='file']
		
		ele.sendKeys("F:\\API FileUpload\\selenium_4_logo.png");
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
