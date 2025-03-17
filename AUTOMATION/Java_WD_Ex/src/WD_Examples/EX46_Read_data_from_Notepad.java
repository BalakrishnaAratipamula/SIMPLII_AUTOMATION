package WD_Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EX46_Read_data_from_Notepad {
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\Notepad.txt"); // ‪F:\notepad.txt
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str;
		System.out.println("text in notepad is:     ");
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
}
