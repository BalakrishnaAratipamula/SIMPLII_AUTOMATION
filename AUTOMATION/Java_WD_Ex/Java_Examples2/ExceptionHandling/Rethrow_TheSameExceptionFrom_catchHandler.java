package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Rethrow_TheSameExceptionFrom_catchHandler {
	// 1
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
	} //*/
	
	/*/2
	public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Handling partially...");
            throw e; // rethrowing checked exception
        }
    } //*/
}
