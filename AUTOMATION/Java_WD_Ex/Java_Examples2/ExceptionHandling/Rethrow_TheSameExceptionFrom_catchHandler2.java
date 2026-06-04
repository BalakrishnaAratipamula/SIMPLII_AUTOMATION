package ExceptionHandling;

import java.io.IOException;

public class Rethrow_TheSameExceptionFrom_catchHandler2 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (IOException e) {
			System.out.println("Handled in main: " + e.getMessage());
		}
	}
	
	static void method1() throws IOException {
		try {
			throw new IOException("File not found");
		} catch (IOException e) {
			System.out.println("Exception caught in method1");
			throw e; // Rethrowing the exception
		}
	}
}
