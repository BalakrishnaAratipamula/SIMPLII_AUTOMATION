package Practice;

import java.util.Scanner;

public class E18_ScannerClassEx {
	public static void main(String[] args) {
		// int i = 14; //input

		// passing
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'i' vaue:  ");
		int i = sc.nextInt();

//		for(int i = sc.nextInt(); i<4; i++) {
//			System.out.println("Bala");
//		}

		System.out.println("Value of 'i' is:  " + i);
	}
}
