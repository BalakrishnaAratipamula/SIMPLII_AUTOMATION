package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX62_SVG_Elements_Handling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("====noneed to excute just refer below URL===="); 
		//https://www.w3docs.com/tools/editor/4472
		
		
		//https://www.w3docs.com/tools/editor/4472
		driver.findElement(By.xpath("//*[name()='svg']//*[name()='rect']"));
		driver.findElement(By.xpath("//*[local-name()='svg']//*[local-name()='rect']"));
		driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle']"));
		driver.findElement(By.xpath("//*[name()='svg']//*[name()='polygon']"));
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='mdc-checkbox__checkmark']"));
		driver.findElement(By.xpath("//*[name()='svg' and @id='cookiescript_manageicon']"));
		
		driver.quit();
	}
}
