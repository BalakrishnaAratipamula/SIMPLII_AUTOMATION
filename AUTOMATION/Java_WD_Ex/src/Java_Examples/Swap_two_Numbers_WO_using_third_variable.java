package Java_Examples;
//Java int coding qns : #18 Swap two Numbers / Swap two numbers without using third variable
public class Swap_two_Numbers_WO_using_third_variable {
	public static void main(String[] args) {

		int a = 9, b = 20;

		// Logic to swap 2 numbers.
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping:  a = " + a + ", b = " + b);
	}

}
