package Java_Examples;

import java.util.Scanner;

public class ScannerClass2 {
	public static void main(String args[]) {

		// adding two numbers
		Scanner sc = new Scanner(System.in);// object creation for scanner class
		System.out.println("Enter first number");
		int num1 = sc.nextInt();// To read data from console
		System.out.println("Enter second number");
		int num2 = sc.nextInt();// To read data from console
		System.out.println("Your sum is: " + (num1 + num2));

		sc.close();

	}
}
