package WD_Examples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EX47_Writedata_in_Notepad {
	public static void main(String[] args) throws Exception {
		File f = new File("F:\\Notepad from eclipse.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("***Balakrishna***");
		bw.newLine();
		bw.write("***Nellore***");
		bw.newLine();
		bw.write("***AP***");
		bw.newLine();

		bw.close();
		fw.close();

		System.out.println("please check local drive");
	}
}
