package Check_Whether_Perfect_String_Int;

import java.util.Scanner;

public class IntCheck_checkIntOrNot_UsingScannerClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");

		if (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			System.out.println(num + " is a valid integer.");
		} else {
			System.out.println("Input is not a valid integer.");
		}
		scanner.close();
	}
}
