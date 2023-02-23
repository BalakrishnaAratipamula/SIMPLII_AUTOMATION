package Java_Examples;

public class get_char_by_index_from_string { /////see all

	/*getChars(int srhStartIndex, int srhEndIndex, char[] destArray, int destStartIndex)     
	Parameters:
		srhStartIndex : Index of the first character in the string to copy. 
		srhEndIndex : Index after the last character in the string to copy.
		destArray : Destination array where chars will get copied.
		destStartIndex : Index in the array starting from where the chars will be pushed into the array. */



	/*/ Function to get the specific character 
	public static char getCharFromString(String str, int index) { 
		char[] singleCharArray = new char[1]; //to store single char
		// Get specific character from the String 
		str.getChars(index, index+1, singleCharArray, 0); 
		// Return the specific character  
		return singleCharArray[0]; //because of single character return array size is '0' 
	} 

	// Driver code 
	public static void main(String[] args) { 
		String str = "GeeksForGeeks"; 
		int index = 4; 
		char ch = getCharFromString(str, index); // Get the specific character

		System.out.println("Character from " +str+ " at index " +index+ " is " +ch); 

	} */



		/*public static void main(String[] args) {  
		String str = new String("a bc");  
		char[] ch  = new char[4];  
		try {  
			str.getChars(0, 3, ch, 0);  
			System.out.println(ch);  
		}
		catch(Exception e) {  
			System.out.println(e);  
		} */


}


