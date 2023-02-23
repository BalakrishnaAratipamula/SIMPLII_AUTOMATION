package Java_Examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_char_from_String {
	//Remove duplicate characters from string using 'Loop cond only'
	public static void main(String[] args){
		String input = new String("aba");   // (or) String input = "abbbb_bbaabb bbb bbbb_bcc**ccd";
		String output = "";
		for(int i=0; i<input.length(); i++) {
			boolean check = false;
			for(int j=0; j<output.length(); j++) { //at j=o condition will get fail
				if(output.charAt(j)==input.charAt(i)) { ///charAt(index)
					check = true;  
				}
			}
			if(!check) { //if doesnt disturb check then only will enter inside
				output = output+input.charAt(i);
			}
		}
		System.out.println(output);   

	
	}
}