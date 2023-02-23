package Java_Examples;

import java.util.Scanner;

public class conditionalstmts_nested_if {
	public static void main(String[] args) {
		/*////////Def: condition it self it one more condition will come 
		int age=18;
		int weight=60;
		if(age>=18) {
			if(weight>50) {
				System.out.println("ur eligible to donate blood");	
			}else {
				System.out.println("ur not eligible to donate blood");
			}
		}
		else {
			System.out.println("age must be >=18 ");
		} */



		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter your Age: ");
		int age = sc.nextInt();

		if(age<18) {
			System.out.println("You are Minor."); 
			System.out.println("So, You are Not Eligible to Work");
		}
		else {
			if(age>=18 && age<=60) {
				System.out.println("You are Eligible to Work");
				System.out.println("Please fill in your details and apply");
			}
			else {
				System.out.println("You are too old to work as per the Government rules");
				System.out.println("Please Collect your pension!");
			}
		}
		System.out.println("\n\nThis Message is coming from Outside of if-else STATEMENT");	//\n-- take one line gap */


	}
}
