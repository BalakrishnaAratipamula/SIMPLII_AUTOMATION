package Java_Examples;

public class Swap_two_Numbers {
	public static void main(String[] args) {

		int num1 = 9;
		int num2 = 20;
		int i;

		// Logic to swap 2 numbers.
		i = num1 + num2;
		num2 = i - num2;
		num1 = i - num2;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
