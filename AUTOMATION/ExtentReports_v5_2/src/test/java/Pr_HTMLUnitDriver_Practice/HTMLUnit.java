package Pr_HTMLUnitDriver_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HTMLUnit {
	@Test
	public void headLessBrowserTest() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Test");

		System.out.println("Page title is: " +driver.getTitle());
		System.out.println("Page URL is: " +driver.getCurrentUrl());
		
		driver.quit();
	}
}
