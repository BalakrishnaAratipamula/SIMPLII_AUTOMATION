package Check_Whether_Perfect_String_Int;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntCheck_checkIntOrNot_UsingBufferedReader {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a number: ");
		try {
			String input = reader.readLine(); // Read input as a string
			int number = Integer.parseInt(input); // Try parsing it to an integer
			System.out.println(input + " is a valid integer.");
		} catch (IOException e) {
			System.out.println("An error occurred while reading input.");
		} catch (NumberFormatException e) {
			System.out.println("The input is not a valid integer.");
		}
	}
}
