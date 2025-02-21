package Automation.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4c_Uncheck_2nd_CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // --RTP Concept
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//to uncheck the 2nd check box
		driver.findElement(By.xpath("//*[@class='table8']/input[position()=2]")).click(); //(or) //*[@class='table8']/input[2]
		System.out.println("unchecked 2nd checkbox");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
