//Create ATS to validate login functionality using valid data in Gmail application
package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX24_get_page_title {
	public static void main(String[] args) throws Exception{
		// initialize browser and open gmail
		WebDriver driver= new FirefoxDriver();
		driver.get("http://gmail.com"); //try with facebook login 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//to perform login operation
		driver.findElement(By.id("identifierId")).sendKeys("bhanu10205@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(9000);

		//Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sr786bhanu786");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(9000);

		String pgTitle = driver.getTitle();
		System.out.println("Page title is: "+pgTitle);
		if (pgTitle.contains("aratipamula.balakrishna@gmail.com - Gmail")){//here contains method is used because if u get new mail. the inbox value going to change so euals() not applicable to this
			System.out.println("Successful login operation");
		}
		else{
			System.out.println("Unsuccessful login operation");
		}

	}
}
