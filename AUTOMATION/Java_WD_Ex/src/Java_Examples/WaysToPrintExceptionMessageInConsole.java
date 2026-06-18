package Java_Examples;

public class WaysToPrintExceptionMessageInConsole {
	public static void main(String[] args) {
		try {
		    int result = 10 / 0;
		} catch (ArithmeticException e) {

		    // Prints complete stack trace
		    e.printStackTrace();

		    // Prints only the exception message
		    System.out.println(e.getMessage());

		    // Prints exception type and message
		    System.out.println(e);
		}
	}
}
