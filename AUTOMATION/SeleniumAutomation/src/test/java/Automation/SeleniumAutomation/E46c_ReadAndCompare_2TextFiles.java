package Automation.SeleniumAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class E46c_ReadAndCompare_2TextFiles {
	public static void main(String[] args) throws IOException{
		BufferedReader textFile1 = new BufferedReader(new FileReader("F:\\NotepadData.txt")); //file 1
		BufferedReader textFile2 = new BufferedReader(new FileReader("F:\\NotepadDataFromEclipse.txt")); //file 2
		String contentOfTexFile1 = textFile1.readLine(); //to capture the content and store in String var
		String contentOfTexFile2 = textFile2.readLine();
		
		boolean areEqual = true;
		
		int lineNum = 1; //to print the line number once content is mismatch
		
		while(contentOfTexFile1 != null || contentOfTexFile2 != null) { //while loop is due to we don't know the number of iterations till condition get true
			if(contentOfTexFile1 == null || contentOfTexFile2 == null) { //negetive - null
				areEqual = false;
			} else if(!contentOfTexFile1.equals(contentOfTexFile2)) { //negetive - not equal
				areEqual = false;
				break;
			}
			contentOfTexFile1 = textFile1.readLine();
			contentOfTexFile2 = textFile2.readLine();
			lineNum++;
		}
		
		if(areEqual) //positive - true    
			System.out.println("Two files have same content.");
		else {
			System.out.println("Two files have different content.");
			System.out.println("File1 has==> "+contentOfTexFile1+"\tFile2 has==> "+contentOfTexFile2+" mismatch at line: "+lineNum); //\t for tab space
		}
		textFile1.close();
		textFile2.close();
	}
}
