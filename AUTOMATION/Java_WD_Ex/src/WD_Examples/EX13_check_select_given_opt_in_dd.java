//write script to select and check given country name in "Country" dropdown at Mercury tours application
package WD_Examples;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EX13_check_select_given_opt_in_dd {
	public static void main(String[] args) {

		boolean myStatus=false;

		//to read user input use Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter which country u want to select");
		String scnr = sc.nextLine();

		//to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		//to click on register link
		driver.findElement(By.linkText("REGISTER")).click();

		//to read each country name from dropdown
		Select sel = new Select(driver.findElement(By.name("country"))); //name("country")----parent tag of dd list exixt
		List<WebElement> options = sel.getOptions();
		System.out.println("Number of options are: "+options.size());
		
		//to select given country name in "Country" dd by using for-each
		for(WebElement option: options) {
			String str = option.getText();
			if(str.trim().equalsIgnoreCase(scnr.trim())) {//comparing with 'scnr' i.e. given option & 'trim()' for remove trailing spaces (before & front) & 'equalSignoreCase()' for to compare string if give lower case can consider as upper case so no need to use toUpperCase() 
				sel.selectByVisibleText(str.trim());
				System.out.println("Expected country name exist");
				myStatus = true; // if Expected country name exist 'myStatus' will going to 'true' after that will take 'break'
				break; 
			}
		}
		if (myStatus==false) {//if can use 'else' check dropdown list fron starting to ending and print each comparing result in console for every option
			System.out.println("Expected country name doesn't exist");
		}

		sc.close();
	}
}























