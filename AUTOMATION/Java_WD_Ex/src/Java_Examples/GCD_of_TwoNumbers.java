package Java_Examples;
//Java int coding qns : #13 GCD of two numbers
public class GCD_of_TwoNumbers {
	public static void main(String[] args) {
		// GCD means factorial of two numbers and take maximum common number
		int a = 60, b = 48;
		while(b != 0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		System.out.println(a);
	}
}
