package Java_Examples;

public class Swap_two_Numbers {
	public static void main(String[] args) {

		int a = 9;
		int b = 20;
		int c;

		// Logic to swap 2 numbers.
		c = a + b;
		b = c - b;
		a = c - b;

		System.out.println("num1 = " + a);
		System.out.println("num2 = " + b);
	}

}
