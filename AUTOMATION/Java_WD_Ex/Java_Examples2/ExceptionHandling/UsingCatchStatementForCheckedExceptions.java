package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsingCatchStatementForCheckedExceptions {
	// Execution 1: Handling Checked Exceptions with catch
	public static void main(String[] args) {
		try {
			// Attempt to open a file that might not exist
			Scanner scanner = new Scanner(new File("nonexistent1.txt"));
		} catch (FileNotFoundException e) {
			// Handling the checked exception
			System.out.println("File not found: " + e.getMessage());
		}
	} //*/

	
	/*/ Execution 2: Declaring with throws
	public static void main(String[] args) throws FileNotFoundException {
		// This method does NOT handle the exception, just declares it
		Scanner scanner = new Scanner(new File("nonexistent1.txt"));
	} //*/

}
