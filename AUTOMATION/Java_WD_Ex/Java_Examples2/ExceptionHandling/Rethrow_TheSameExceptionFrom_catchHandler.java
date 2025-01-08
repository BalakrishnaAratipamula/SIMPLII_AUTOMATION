package ExceptionHandling;

public class Rethrow_TheSameExceptionFrom_catchHandler {
	public static void main(String[] args) {
		try {
			performTask();
		} catch(Exception e) {
			System.out.println("catch in main(): "+e.getMessage());
		}
	}
	
	public static void performTask() throws Exception {
		try {
			throw new Exception("Original Exception");
		} catch(Exception e) {
			System.out.println("Handling Exception: "+e.getMessage());
			throw e; //re throwing the same exception
		}
	}
}
