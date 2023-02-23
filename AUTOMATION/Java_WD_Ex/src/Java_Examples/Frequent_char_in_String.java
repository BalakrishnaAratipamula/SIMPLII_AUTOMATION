package Java_Examples;

import java.util.HashMap;
import java.util.Scanner;

public class Frequent_char_in_String {
	public static void numOfOccurenceOfChar(String str){  /// 1st & 2nd
		//1. Create an ASCII_SIZE array i.e. 256 (---Dummy array to store output---)  ///////// ASCII is a 7-bit code, representing 128 different characters 
		int[] count = new int[256]; //input is not array so we have to conv string to array and then do bellow steps 2,3,4,5
		int len = str.length(); 
		System.out.println("Length of String is: "+len);

		//2. Initialize 'count' by index 
		for(int i=0; i<len; i++) {
			count[str.charAt(i)]++;
		} 

		//4. Create an array of given String size (bcz input is not array)
		char[] ch = new char[len]; 
		for(int j=0; j<len; j++){ 
			ch[j] = str.charAt(j); //4. assigning characters from 'str'(String content) to 'ch'(char array)
			int find = 0; 
			for(int k=0; k<=j; k++){ //5. check for match
				// If any matches found 
				if(str.charAt(j)==ch[k]) { 
					find++;  
				}
			} 
			if(find==1){  
				System.out.println("Number of Occurrence of  " +str.charAt(j)+ "  is: " +count[str.charAt(j)]);  
			}    
		} 
	} 

	public static void main(String[] args) { 
		String str = "aaba";

		numOfOccurenceOfChar(str); 

	} 





	/*/ Find Frequency of Character in string
	public static void main(String[] args) {
		String str = "This@website=is_awesome.";
		char ch = 'e';
		int freq=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				++freq;
			}
		}
		System.out.println("Frequency of " + ch + " = " + freq);
	} */






	/*/Occurrence of each char in String using HashMap
	public static void main(String[] args) {
	      String str = "a b_c-dd=2";
	      HashMap<Character, Integer> hMap = new HashMap<>(); //HashMap<key, value>
	      System.out.println("Length of Strig is: "+str.length());
	      for(int i=str.length()-1; i>=0; i--){  //check from back onwards
	    	 char ch = str.charAt(i);
	         if(hMap.containsKey(str.charAt(i))){ 
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	            //System.out.println("if");
	         } else { ///////Result displaying from else loop
	            hMap.put(str.charAt(i),1); //to assign initial count value i.e. count=1 at initial
	            //System.out.println("else");
	         }
	      }
	      System.out.println(hMap);
	   } 
	//obj.containsKey(Object key): To search the specified key from map
	//obj.get(Object key): To return the value for the specified key
	//obj.put(Object key, Object value): To insert an entry in this map	*/




} 

