package Automation.SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5_Retrive_Names_nd_RadioBtnsCount {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// 'Create new account' button
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		//Radio buttons common XPath
		List<WebElement> radioBtns = driver.findElements(By.xpath("//span/label"));
		
		System.out.println("Radio buttons count:  "+radioBtns.size());
		
		//printing names of Radio Btns
		System.out.println("Radio Button Names:  ");
		for(WebElement radioBtn: radioBtns) {
			String radioBtnName = radioBtn.getText();
			System.out.println(radioBtnName);
			radioBtn.click();
			System.out.println(radioBtnName+"  is clicked");
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
