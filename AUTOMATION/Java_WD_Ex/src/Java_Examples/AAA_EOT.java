package Java_Examples;

import java.util.Scanner;

public class AAA_EOT {
	public static void main(String args[]) {
	/*/program to display even numbers upto 20
	for(int i=1; i<=20; i++) {
		if(i%2==0) {
			System.out.print(i+", ");

		}
	} */

	/*/program to display odd numbers upto 20
	for(int i=1; i<=20; i++) {
		if(i%2!=0) {
			System.out.println(i);
		}
	}*/

	/*/program to print multiplication table as user choice
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter which table u require");
	int n = sc.nextInt();
	for(int i=1; i<=10; i++) {
		System.out.println(n+" * "+i+" = " +(n*i));
	} */

	/*float f = (float) 1.123456789012345678901234567890123456789;
	double d = 1.1234567890123456789012345678901234567890;
	System.out.println("float:   "+f);
	System.out.println("double:  "+d); */



		/*/java program to reverse numbers
		int num = 10234;
		int rev = 0; 
		System.out.println("Given num is:  "+num);
		while(num!=0) {  
			int remainder = num%10;  
			rev = rev * 10 + remainder;  
			num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev); */


		//Split number
		int num = 122345;
		String num2 = String.valueOf(num); //valueOf() -- string representation of given value
		char[] digits = num2.toCharArray();
		for(int i=0; i<digits.length; i++) {
			System.out.println(digits[i]);
		}

	}
}
