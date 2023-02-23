package WD_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX29_gmail_end_to_end_scenario {
public static void main(String[] args) throws Exception{
	// initialize browser and open gmail
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://gmail.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	//to perform login operation
	driver.findElement(By.id("identifierId")).sendKeys("aratipamula.balakrishna@gmail.com");
	driver.findElement(By.xpath("//*[text()='Next']")).click();

	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("sr786bhanu786");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
			
	Thread.sleep(5000);
	String pgTitle= driver.getTitle();
	System.out.println("page title is:  "+pgTitle);
	if (pgTitle.contains("aratipamula.balakrishna@gmail.com - Gmail")){
		System.out.println("Successful login operation");
		
		}
		else{
		System.out.println("Unsuccessful login operation");
		}
	//compose mail 
	driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	Thread.sleep(2000);
	//-enter "To" mail id
	driver.findElement(By.name("to")).sendKeys("bhanuelectrical205@gmail.com");
	// to enter subject
	Thread.sleep(2000);
	driver.findElement(By.name("subjectbox")).sendKeys("Uploading file");
	//to attach file
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
	Thread.sleep(4000);
	
	//to select file path
	Runtime.getRuntime().exec("F:\\AutoIT\\file.exe");				
	Thread.sleep(10000);
	
	//send mail
	driver.findElement(By.xpath("//*[text()='Send']")).click();
	//signout
	Thread.sleep(9000);
	driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Sign out")).click();
}
}
