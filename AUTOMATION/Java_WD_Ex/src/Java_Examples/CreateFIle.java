package Java_Examples;

import java.io.File;
import java.io.IOException;

public class CreateFIle {
	public static void main(String[] args) {
		try {
			File file = new File("myFile.txt");
			boolean isCreated = file.createNewFile();
			if(isCreated) {
				System.out.println("File created successfully...!");
			}else {
				System.out.println("File already exists with same name...!");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
