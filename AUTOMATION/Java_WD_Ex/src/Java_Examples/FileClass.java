package Java_Examples;

import java.io.File;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) throws IOException {
        File file = new File("FileClassTest.txt");
        
        if (!file.exists()) {
        	System.out.println("File not exists so creating the file");
            file.createNewFile();  // Create new file
            System.out.println("File is created under project level: Refresh the project --> search for FileName");
        }

        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("file exist or not: " + file.exists());
    }
}
