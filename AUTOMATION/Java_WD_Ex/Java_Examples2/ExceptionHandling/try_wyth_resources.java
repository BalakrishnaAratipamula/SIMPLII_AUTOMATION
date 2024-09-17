package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class try_wyth_resources {
	public static void main(String[] args) {
	    String line;
	    try(BufferedReader br = new BufferedReader(new FileReader("E:\\test.txt"))) {
	      while ((line = br.readLine()) != null) {
	        System.out.println("Line => "+line);
	      }
	    } catch (IOException e) {
	      System.out.println("IOException in try block =>" + e.getMessage());
	    }
	  }
}
