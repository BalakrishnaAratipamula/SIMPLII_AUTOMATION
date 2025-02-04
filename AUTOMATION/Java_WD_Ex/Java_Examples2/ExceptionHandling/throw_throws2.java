package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class throw_throws2 {
	/*/Ex 1
	public static void main(String[] args) {
        try {
            checkNumber(10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // Method to check if a number is greater than 5
    public static void checkNumber(int num) throws Exception {
        if (num <= 5) {
            throw new Exception("Number is less than or equal to 5!");
        } else {
            System.out.println("Number is greater than 5.");
        }
    } //*/
	
	
	//Ex 2
	public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }

    // This method throws an IOException
    public static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistentfile.txt");
        BufferedReader fileInput = new BufferedReader(file);
        fileInput.readLine();
        fileInput.close();
    }
}
