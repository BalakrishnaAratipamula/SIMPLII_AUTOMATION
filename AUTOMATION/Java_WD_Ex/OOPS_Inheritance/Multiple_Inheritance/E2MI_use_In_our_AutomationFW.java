package Multiple_Inheritance;

//2. Page Object Model with Utility Methods (In POM we can use multiple interfaces to define common functionalities for page actions, validation utilities, and reporting).
interface PageActions {
	void clickElement();

	void enterText(String text);
}

interface ValidationActions {
	boolean isElementDisplayed();

	boolean isTextMatching(String expected);
}

class LoginPage implements PageActions, ValidationActions {
	@Override
	public void clickElement() {
		System.out.println("Clicked on element");
	}

	@Override
	public void enterText(String text) {
		System.out.println("Entered text: " + text);
	}

	@Override
	public boolean isElementDisplayed() {
		System.out.println("Element is displayed");
		return true;
	}

	@Override
	public boolean isTextMatching(String expected) {
		System.out.println("Text is matching: " + expected);
		return true;
	}
}

// Using LoginPage in Test Class
public class E2MI_use_In_our_AutomationFW {
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.clickElement();
		login.enterText("testUser");
		System.out.println(login.isElementDisplayed());
	}
}
