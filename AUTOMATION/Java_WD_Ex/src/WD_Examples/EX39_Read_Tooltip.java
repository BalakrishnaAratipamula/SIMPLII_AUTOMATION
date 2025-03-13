package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX39_Read_Tooltip {
	public static void main(String[] args) {
		// To initialize browser
		WebDriver driver= new FirefoxDriver();
		driver.get("http://rediffmail.com");
		driver.manage().window().maximize();

		//to read tooltip of 'Sign in'
		String toolTipText1 = driver.findElement(By.linkText("Sign in")).getAttribute("title"); //getAttribute("Tool tip attribute type/name") (by inspect Tooltip  contains)
		System.out.println("Tooltip of 'Sign in' link is:  "+toolTipText1);												  

		//to read tooltip of 'Create Account'
		String toolTipText2 = driver.findElement(By.linkText("Create Account")).getAttribute("title"); //getAttribute("Tool tip attribute type/name") (by inspect Tooltip  contains)
		System.out.println("Tooltip of 'Sign in' link is:  "+toolTipText2);												  

		driver.quit();
	}
}
