package Practice_Pa;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX13_check_select_given_opt_in_dd {
public static void main(String[] args) {
	
	boolean mystatus=false;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the DD value");
	String a = sc.nextLine();
	
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("REGISTER")).click();
	
	Select ddp = new Select(driver.findElement(By.name("country")));
	List<WebElement> options = ddp.getOptions();
	System.out.println("List of DD options are: "+options.size());

	for(WebElement option:options) {
		String ops = option.getText();
		if(ops.trim().equalsIgnoreCase(a)) {
			ddp.selectByVisibleText(ops.trim());
			System.out.println("Expected country exist in DD list");
			mystatus = true;
			break;
		}
	}
	if(mystatus==false) {
		System.out.println("Expected country doesn't exist in DD list");
	}
}
}
