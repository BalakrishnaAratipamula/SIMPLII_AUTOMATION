package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX39_Read_Tooltip {
	public static void main(String[] args) {
		// To initialize browser
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://rediffmail.com");
		driver.manage().window().maximize();

		//to read tooltip from "Rediffmail
		String toolTip = driver.findElement(By.linkText("Rediffmail")).getAttribute("title"); //getAttribute("Tool tip attribute type/name")
		System.out.println(toolTip);														  //////by inspect tooltip  contains


	}
}
