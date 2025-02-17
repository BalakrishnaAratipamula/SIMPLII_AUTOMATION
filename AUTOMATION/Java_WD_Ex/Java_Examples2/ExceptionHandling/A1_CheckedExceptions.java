package ExceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A1_CheckedExceptions {
	public static void main(String[] args) {
		try {
			File file = new File("myFile.txt");
			Scanner scanner = new Scanner(file);
		} catch(IOException e) {
			System.out.println("File not Found");
		}
	}
}
