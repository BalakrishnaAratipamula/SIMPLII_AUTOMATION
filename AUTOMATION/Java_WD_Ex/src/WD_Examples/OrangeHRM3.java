package WD_Examples;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM3 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);			
		driver.findElement(By.linkText("Configuration")).click();		
		driver.findElement(By.linkText("Email Configuration")).click(); 
		driver.findElement(By.id("editBtn")).click();		
		driver.findElement(By.id("emailConfigurationForm_txtMailAddress")).clear();
		driver.findElement(By.id("emailConfigurationForm_txtMailAddress")).sendKeys("123abc@Exmple.com");		
		Select drpdown=new Select(driver.findElement(By.id("emailConfigurationForm_cmbMailSendingMethod")));		
	    drpdown.selectByVisibleText("Sendmail");	
	    
	   // String Expectedtital="Sendmail";
	    if ("Sendmail".equals("Sendmail")) {
	    	driver.findElement(By.id("emailConfigurationForm_txtSendmailPath")).clear();
	    	driver.findElement(By.id("emailConfigurationForm_txtSendmailPath")).sendKeys("D://screnshoot");
			driver.findElement(By.id("emailConfigurationForm_chkSendTestEmail")).click();			
			driver.findElement(By.id("emailConfigurationForm_txtTestEmail")).sendKeys("qwerty123@gmail.com");
			driver.findElement(By.id("editBtn")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("editBtn")).click();
			
			 //String Expectedtital2="SMTP";
			 if("SMTP".equals("SMTP"))
			 {
			 Select drpdown2=new Select(driver.findElement(By.id("emailConfigurationForm_cmbMailS")));
			 }
	    }
	}
}