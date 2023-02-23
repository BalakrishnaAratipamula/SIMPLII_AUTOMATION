package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex32_frame {
public static void main(String[] args) throws Exception {
	//to initialize the browser
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		//switch to frame
		driver.switchTo().frame("login_page");//stmt rep while working with frames to navigate which frame u can enter
		//to click on continue
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		Thread.sleep(3000);
		//to read msg from alt
		String var = driver.switchTo().alert().getText();//we are giving instructions to driver obj, switchTo alert window and from alert window getText and store it in system clipboard
		System.out.println(var);
		//to close alert window
		driver.switchTo().alert().accept();
		//to enter customet id
		driver.findElement(By.name("fldLoginUserId")).sendKeys("4567");
}
}
