package Java_Examples;

import java.util.Scanner;

/* An Armstrong Number is a number in which the sum of the cubes of each digit is equal to the number itself. For ex:
 * 371 = 3*3*3 + 7*7*7 + 1*1*1 = 371 
 */

public class Armstrong_number_r_not {
	//pre-req program
	/*/
	public static void main(String[] args) {
        System.out.println(Math.sqrt(16)); // Error: Ambiguity
    } //*/
	
	/*/
	public static void main(String args[]){
        double a = 4;
        double b = 4;
        //The Math.pow() is used to calculate a number raise to the power of some other number.
        System.out.println(Math.pow(a, b)); //'a' power 'b'
 
        a = 2.5;
        b = 6.9;
        System.out.println(Math.pow(a, b)); //'a' power 'b'
    } //*/
	
	//Java int coding qns : #11 Check Armstrong Number or Not
	//Armstrong_number_or_not //sum of the cubes of each digit is equal to the number itself
	public static void main(String[] args) {
		int num = 153, sum = 0, temp = num;
		while(temp != 0) {
			int digit = temp % 10;
			sum += java.lang.Math.pow(digit, 3);
			temp /= 10;
		}
		System.out.println(num == sum); 
	} //*/
	
	
	
	
	/*/ Armstrong_number_or_not
	public static void main(String[] args) {

		int num = 371;	//153, 371
		int actNum = num;
		double result = 0;

		while (actNum != 0) {
			int n = actNum % 10;			  	
			result = result + Math.pow(n, 3); //'n' power '3' //The Math.pow() is used to calculate a number raise to the power of some other number.
			actNum = actNum / 10;
		}

		if (result == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	} //*/
	
	
	/*/
	public static void main(String[] args) {
		int arm=0, x, y, num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		y=num;
		
		while(num>0) {
			x=num%10;
			num=num/10;
			arm=arm+x*x*x;
		}
		if(arm==y)
			System.out.println("Armstrong number");
		else
			System.out.println("Is not Armstrong number");
	} //*/
}
