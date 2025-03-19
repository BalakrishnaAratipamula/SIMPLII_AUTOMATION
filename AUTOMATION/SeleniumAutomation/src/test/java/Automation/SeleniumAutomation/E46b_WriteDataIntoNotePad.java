package Automation.SeleniumAutomation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class E46b_WriteDataIntoNotePad {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\NotepadDataFromEclipse.txt");	//to create location of the file
		FileWriter fw = new FileWriter(file);	//to open the file
		BufferedWriter bw = new BufferedWriter(fw); //to write data line by line
		
		bw.write("****Robot Framework*****");
		bw.newLine(); //to focus on next line
		bw.write("****Python*****");
		bw.newLine();
		bw.write("****C#*****");
		bw.newLine();
		
		bw.close();
		fw.close();
	}
}
