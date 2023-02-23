package Practice_Pa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX24_Syn_get_page_title {
public static void main(String[] args) throws Exception {
	// initialize browser and open gmail
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to perform login operation
		driver.findElement(By.id("identifierId")).sendKeys("aratipamula.balakrishna@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
				
		//Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sr786bhanu786");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//to pause execution until process complete
		Thread.sleep(9000);
		
		String pgTitle= driver.getTitle();
		System.out.println("Page title is: "+pgTitle);
		
		if (pgTitle.contains("aratipamula.balakrishna@gmail.com - Gmail")){//here contains method is used because if u get new mail. the inbox value going to change so euals() not applicable to this
			System.out.println("Successful login operation");
			}
			else{
				System.out.println("Unsuccessful login operation");
				}
		
}
}
