//write script to find number of frames in a page and to read each frame name
package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX30_frames_print_num_framename {
	public static void main(String[] args) throws Exception {
		//to initialize browser
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		Thread.sleep(6000);

		//to find number of Frames in a page
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe")); //(or) tagName("frame") 
		System.out.println("Number of frames are: "+totalframes.size());

		//to read each frame name
		for(WebElement frame: totalframes) {
			//System.out.println( frame.getAttribute(frame));//result will display frame html code
			System.out.println(frame.getAttribute("name"));//getAttribute("name")-------here i want to read attribute value so, to read attribute value of element this is common while working with frames to find Text of frame tag
		}
		driver.quit();
	}
}
