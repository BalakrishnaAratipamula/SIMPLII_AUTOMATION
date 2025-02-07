package Java_Examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck_ValidOrNot {
	// Define the regex pattern for a valid email address
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-/?#]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}$"; //specify anything u want (chars, special chars...) 
	private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

	// Method to validate email
	public static boolean isValidEmail(String email) {
		if (email == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an email address to validate: ");
		String email = scanner.nextLine();

		if (isValidEmail(email)) {
			System.out.println("Valid email address.");
		} else {
			System.out.println("Invalid email address.");
		}

		scanner.close();
	}
}
