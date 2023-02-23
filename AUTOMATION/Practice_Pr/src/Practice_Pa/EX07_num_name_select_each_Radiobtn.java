//write script to find number of radio buttons in FB-home page, read name of each radio button then select one by one radio button
package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX07_num_name_select_each_Radiobtn {
public static void main(String[] args) throws Exception {
	//to initialize the browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://facebook.com");
	driver.manage().window().maximize();
	
	List<WebElement> refObj = driver.findElements(By.className("_58mt"));
	int count = refObj.size();
	System.out.println("num of radio btns are: "+count);
	
	System.out.println("name of radio buttons: ");
	for(WebElement obj : refObj) {
		String radn = obj.getText();
		System.out.println(radn);
		obj.click();
		Thread.sleep(3000);
	}
	driver.close();
}
}
