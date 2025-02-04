package ExceptionHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class throw_throws {

	// Java program to demonstrate the working
	/*/ of throw keyword in exception handling

		public static void main(String[] args){ //throw
			// Use of unchecked Exception
			try {
				// double x=3/0;
				throw new ArithmeticException();
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
			}
		} //*/

/////////////////////////////////////////////////////////////////////////

//Java program to demonstrate the working
//of throws keyword in exception handling


	//
	public static void writeToFile() throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
		bw.write("Test");
		bw.close();
	}

	public static void main(String[] args) throws Exception{
		try {
			writeToFile();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}//*/
} 
		
		
	
	
