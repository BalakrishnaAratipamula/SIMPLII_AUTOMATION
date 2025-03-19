package Automation.SeleniumAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class E46_ReadDataFromNotePad {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\NotepadData.txt");	//to get the file
		FileReader fr = new FileReader(file);	//to open the file
		BufferedReader br = new BufferedReader(fr); //to read data line by line
		
		String str;
		System.out.println("Text in Notepad is:  ");
		while((str=br.readLine())!= null) {
			System.out.println(str);
		}
	}
}
