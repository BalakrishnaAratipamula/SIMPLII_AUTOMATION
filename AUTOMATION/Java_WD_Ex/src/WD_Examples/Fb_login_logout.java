package WD_Examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fb_login_logout {
public static void main(String[] args) throws Exception {
	//to disable notifications
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--disable-notifications");

	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(ops);
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();

	driver.findElement(By.name("email")).sendKeys("bhanu10205@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("pass")).sendKeys("sr786bhanu786");
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("userNavigationLabel")).click();	
	Thread.sleep(2500);
	driver.findElement(By.linkText("Log Out")).click();
	
}
}
