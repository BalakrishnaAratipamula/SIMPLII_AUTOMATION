package ExceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A2_UnCheckedExceptions {
	public static void main(String[] args) {
		try {
			File file = new File("myFile.txt");
			Scanner scanner = new Scanner(file);
		} catch(IOException e) {
			throw new RuntimeException(e);
//			throw new IOException(e); //(or)
		}
	}
}
