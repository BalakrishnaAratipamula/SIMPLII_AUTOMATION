package ModularFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent1 {
//to perform user REgistration
public void userReg(WebDriver driver) throws InterruptedException{
			//to click on "Home" link
			driver.findElement(By.linkText("Home")).click();
			//to click on REgister link
			driver.findElement(By.linkText("REGISTER")).click();
			//to enter "firstName"
			driver.findElement(By.name("firstName")).sendKeys("Smith");
			//to enter user name
			driver.findElement(By.name("email")).sendKeys("Smith");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
			driver.findElement(By.name("register")).click();
			Thread.sleep(3000);
			System.out.println("User Registration operation completed");
}

//to close application
public void tearDown(WebDriver driver){
		driver.close();
		System.out.println("Application closed");
}
}
