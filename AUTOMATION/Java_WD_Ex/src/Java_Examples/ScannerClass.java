package Java_Examples;

import java.util.Scanner;

//@. Java program that accepts runtime input from the user and displays the output 
public class ScannerClass {
	public static void main(String[] args) {
		// Create Scanner object to read input
		Scanner sc = new Scanner(System.in);

		// Prompt the user
		System.out.print("Enter your name: ");

		// Read input as a string
		String name = sc.nextLine();

		// Display output
		System.out.println("Hello, " + name + "! Welcome to Java.");

		// Close the scanner
		sc.close();
	}
}
