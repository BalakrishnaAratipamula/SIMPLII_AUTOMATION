package Java_Examples;
//Java int coding qns : #18 Swap two Numbers
public class Swap_two_Numbers {
	public static void main(String[] args) {

		int a = 9, b = 20;

		// Logic to swap 2 numbers.
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
