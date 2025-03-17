package WD_Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EX48_ReadAndCompare_2TextFiles {
	public static void main(String[] args) throws IOException {
		BufferedReader textFile1 = new BufferedReader(new FileReader("F:\\Notepad.txt"));
		BufferedReader textFile2 = new BufferedReader(new FileReader("F:\\Notepad from eclipse.txt"));
		String contentOfTextFile1 = textFile1.readLine(); // single Line only read at a time
		String contentOfTextFile2 = textFile2.readLine(); // single Line only read at a time

		boolean areEqual = true;

		int lineNum = 1; //It is just for specifying line number in console
//
		while (contentOfTextFile1 != null || contentOfTextFile2 != null) { //we don't know the number of iterations so using while loop
			if (contentOfTextFile1 == null || contentOfTextFile2 == null) {
				areEqual = false;
				break;
			} else if (!contentOfTextFile1.equals(contentOfTextFile2)) {
				areEqual = false;
				break;
			}
			contentOfTextFile1 = textFile1.readLine(); // single Line only read at a time
			contentOfTextFile2 = textFile2.readLine(); // single Line only read at a time
			lineNum++;
		}

		if (areEqual) { // only 'true' statements enter inside
			System.out.println("Two files have same content.");
		} else {
			System.out.println("Two files have different content. They differ at line " +lineNum);
			System.out.println("File1 has==> " +contentOfTextFile1+ "    and     File2 has==> " +contentOfTextFile2+ "   at line " +lineNum);
		}
		textFile1.close();
		textFile2.close(); // */
	}
}
