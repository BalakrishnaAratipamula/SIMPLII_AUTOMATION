package ExceptionHandling;

public class CatchMoreThanOneExcep_in_a_SingleCatchBlock {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			// Here 'e' is final so we can't assign or modify 'e' in the catch statement
			e.printStackTrace();// this is one type of method to trace exception
			System.out.println("inside of catch block");
		}
		System.out.println("outside of catch block");
	}
}
