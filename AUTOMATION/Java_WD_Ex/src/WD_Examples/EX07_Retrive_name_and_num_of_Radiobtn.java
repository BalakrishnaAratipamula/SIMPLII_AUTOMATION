//write script to find number of radiobuttons in FB-home page, read name of each radio button then select one by one radio button
package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX07_Retrive_name_and_num_of_Radiobtn {
	public static void main(String[] args) throws Exception{
		//to initialize the browser
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3500);

		//to find number of radio buttons
		List<WebElement> radBtns = driver.findElements(By.xpath("//span/label")); //or try with - class '_58mt'
		System.out.println("Number of Radiobuttons are: "+radBtns.size());

		for(WebElement radBtn : radBtns) {
			String str = radBtn.getText();
			radBtn.click();
			System.out.println(str+"    Radiobutton is clicked");
			Thread.sleep(3000);
		} 

		/*for(int i=0; i<refobj.size(); i++) {
			String str = refobj.get(i).getText();
			System.out.println("Radio button "+(i+1)+" is   "+str+"   its clicked");
			refobj.get(i).click();
			Thread.sleep(3000);
		} */
		Thread.sleep(1000); 
		
		driver.quit();
	}
}
