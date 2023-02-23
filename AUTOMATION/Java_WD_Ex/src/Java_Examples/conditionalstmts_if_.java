package Java_Examples;

import java.util.Scanner;

public class conditionalstmts_if_ {
	public static void main(String[] args) {
		/*int a=10;
		int b=20;
		if(a<b) {
			System.out.println("a-having smaller value");
		} */


		/*Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age ");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("your age is: " +age);
			System.out.println("you can vote");
		} */


		/*/To find given number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("you entered number is even");
		}if(n%2!=0) {
			System.out.println("you entered number is odd");
		}
		sc.close(); */




		//To print student grades
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter marks: ");
		int marks = sc.nextInt();
		System.out.println("Student marks is: "+marks);
		
		if(marks>=90 && marks<=100) {
			System.out.println("Student grade is: A");
		}
		if(marks>=80 && marks<90){
			System.out.println("Student grade is: B");
		}
		if(marks>=70 && marks<80){
			System.out.println("Student grade is: C");
		}
		if(marks>=61 && marks<70){
			System.out.println("Student grade is: D");
		}
		if(marks>=60 || marks<60){
			System.out.println("Student grade is: E");
		} 
	}

}
