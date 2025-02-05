package AccessModifier;

//A class demonstrating different access modifiers
class Example {
	private String privateMessage = "Private: Only accessible within this class";
	String defaultMessage = "Default: Accessible within the same package";
	protected String protectedMessage = "Protected: Accessible within the package and subclasses";
	public String publicMessage = "Public: Accessible from anywhere";

	// A public method to display private data
	public void showPrivateMessage() {
		System.out.println(privateMessage);
	}
}

//A subclass in the same package
class Subclass extends Example {
	void displayMessages() {
		// System.out.println(privateMessage); // Not accessible
		System.out.println(defaultMessage); // Accessible
		System.out.println(protectedMessage); // Accessible
		System.out.println(publicMessage); // Accessible
	}
}

public class AccessModifiers {
	public static void main(String[] args) {
		Example example = new Example();

		//variable calling
		// System.out.println(example.privateMessage); // Not accessible
		System.out.println(example.defaultMessage); // Accessible (same package)
		System.out.println(example.protectedMessage); // Accessible (same package)
		System.out.println(example.publicMessage); // Accessible (everywhere)

		//method calling
		example.showPrivateMessage(); // Indirect access to private member

		Subclass sub = new Subclass();
		sub.displayMessages();
	}
}
