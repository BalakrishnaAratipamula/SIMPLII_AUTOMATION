package ExceptionHandling;

public class try_try_catch {
	public static void main(String[] args) {

		try {
			try { // nested try
				int a = 10;
				int b = a / 0;
			} catch (Exception e) {
				System.out.println("catch block 1");
			}
		}

		catch (ArithmeticException e) {
			System.out.println("catch block 1");
		}
	}
}
