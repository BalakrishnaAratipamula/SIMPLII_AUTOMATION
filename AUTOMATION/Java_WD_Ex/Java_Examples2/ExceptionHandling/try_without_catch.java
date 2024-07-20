package ExceptionHandling;

public class try_without_catch {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a / 0;
		}

		finally {
			System.out.println("Finally Executed");
		}
	}
}
