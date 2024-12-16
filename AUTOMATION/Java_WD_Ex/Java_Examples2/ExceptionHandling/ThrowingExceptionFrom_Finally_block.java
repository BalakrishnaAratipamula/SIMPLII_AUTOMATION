package ExceptionHandling;

public class ThrowingExceptionFrom_Finally_block {

	public void example() {
	    try {
	    	System.out.println("In try block");
	    } finally {
	        throw new RuntimeException("Exception from finally");
	    }
	}
	
	public static void main(String[] args) {
		new ThrowingExceptionFrom_Finally_block().example(); // Throws "Exception from finally"
	}
}
