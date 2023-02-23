package ModularFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent2 extends Parent1 {
	WebDriver driver;
//to perform login operation
public void userLogin(WebDriver driver) throws InterruptedException{
		driver.findElement(By.linkText("sign-in")).click();
		driver.findElement(By.name("userName")).sendKeys("Smith");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		System.out.println("Successful login operation");

	}

}
