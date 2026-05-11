package WD_Examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class EX64b_DownloadFiles {
	/*/ 1. Chrome Example (Using ChromeOptions)
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", "E:\\Downloads");
		prefs.put("download.prompt_for_download", false);
		prefs.put("safebrowsing.enabled", true);

		options.setExperimentalOption("prefs", prefs);

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://example.com/download");
	} //*/
	
	// 2. Firefox Example (Using FirefoxProfile)
	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();

		profile.setPreference("browser.download.dir", "E:\\Downloads");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");

		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);

		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("https://example.com/download");
	}
}
