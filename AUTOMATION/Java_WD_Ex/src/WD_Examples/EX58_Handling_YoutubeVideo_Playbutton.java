package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX58_Handling_YoutubeVideo_Playbutton {
	public static WebDriver driver;
	private String url = "https://www.youtube.com/watch?v=MfhjkfocRR0";

	public void Youtube() {
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumServer\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void waitFor(int wait) {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isYoutubePlaying() {
		try {
			// wait 4 secs for Youtube video to load
			waitFor(10000);
			WebElement playPauseButton = driver.findElements(By.xpath("//div[2]/div[1]/button")).get(0);
			// video is not playing here.
			if (playPauseButton.getAttribute("data-title-no-tooltip").equals("Play")) {
				System.out.println("This Youtube video wasn't playing but we clicked on it to play the video.");
				// so we click on the play button to play the video then we return true;
				playPauseButton.click();
				return true;
			} else {
				// video should be playing but let's double-check
				if (playPauseButton.getAttribute("data-title-no-tooltip").equals("Pause")) {
					System.out.println("Youtube video is already playing.");
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// only return false if either of the 2 cases above fail.
		return false;
	}

	void quitBrowser(){
		waitFor(6000);
		driver.quit();
	}
	
	public static void main(String[] args) {
		EX58_Handling_YoutubeVideo_Playbutton obj = new EX58_Handling_YoutubeVideo_Playbutton();
		obj.Youtube();
		Boolean result = obj.isYoutubePlaying();
		System.out.println(result);
		obj.quitBrowser();
	}
}
