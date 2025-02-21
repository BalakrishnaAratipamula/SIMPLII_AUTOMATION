// write program to select all the check boxes in a page
package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX04d_Select_all_Checkboxs {
	public static void main(String[] args) throws Exception{
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();

		//to find number of checkboxes in a page
		List<WebElement> eles = driver.findElements(By.name("Checkbox"));//while working with multiple elements (check boxes) 'findElements' & name("Checkbox") is common for all check boxes
		int num = eles.size();
		System.out.println("Number of check box are:"+num);

		//to select mul checkboxes
		for(WebElement ele: eles) {   
			if(ele.isSelected()==false) { //or !checkBox.isSelected()//isSelected() method will give boolean result so can take false/true
				ele.click();
				Thread.sleep(1000);
			}
		} 

		/*for(int i=0; i<num; i++) {
			if(eles.get(i).isSelected()==false) {
				eles.get(i).click();
			}
		} */
		
		driver.quit();
	}
}