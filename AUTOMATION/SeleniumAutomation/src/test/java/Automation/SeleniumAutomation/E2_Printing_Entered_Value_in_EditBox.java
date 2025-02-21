package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2_Printing_Entered_Value_in_EditBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		String emailContent = "BalakrishnaAratipamula";
		
		WebElement email = driver.findElement(By.name("email"));
		//to clear text in edit box
		email.clear();
		//passing text into email edit box
		email.sendKeys(emailContent);
		Thread.sleep(1000);
		
		//to read the value from edit box
		String enterdValueInEmailEditBox = email.getAttribute("value");
		
		System.out.println("Entered data in 'Email' Edit Box:  "+enterdValueInEmailEditBox);
		
		//to compare ActualValue with ExpectedValue
		if(emailContent.equals(enterdValueInEmailEditBox)) 
			System.out.println("Expected Value Displayed");
		else
			System.out.println("Expected Value not Displayed");
		
		Thread.sleep(3000);
		driver.quit();
	}
}






