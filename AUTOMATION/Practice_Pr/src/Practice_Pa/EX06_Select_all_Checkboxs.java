package Practice_Pa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX06_Select_all_Checkboxs {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://echoecho.com/htmlforms09.htm");
	driver.manage().window().maximize();
	
	List<WebElement> refObj = driver.findElements(By.name("Checkbox"));
	int a = refObj.size();
	System.out.println("num of check boxes are: "+a);
	
	/*for(WebElement variable : refObj) { 
		if(variable.isSelected()==false) {
			variable.click();
			Thread.sleep(3000);
		}
	}*/
	for(int i=0; i<=a-1; i++) {
		if(refObj.get(i).isSelected()==false) {
			refObj.get(i).click();
			Thread.sleep(3000);
		}
	}
	driver.close();
}
}
