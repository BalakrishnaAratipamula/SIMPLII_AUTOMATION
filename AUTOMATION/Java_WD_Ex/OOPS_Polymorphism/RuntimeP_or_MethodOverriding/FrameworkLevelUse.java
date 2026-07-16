package RuntimeP_or_MethodOverriding;

class LoginPage {
    public void login() {
        System.out.println("Login through Web UI");
    }
}

class MobileLoginPage extends LoginPage {
    @Override
    public void login() {
        System.out.println("Login through Mobile App");
    }
}

public class FrameworkLevelUse {
	public static void main(String[] args) {
		LoginPage page = new MobileLoginPage();
		page.login(); //Output: Login through Mobile App
	}
}
//Conclusion: The login() method behaves differently depending on the object assigned to the parent reference.
