package Java_Examples;

public class Remove_1st_last_ele_from_String {
	//Remove first and last char from String
	public static String FirstAndLast(String str) { 
		// Split the String based on the space 
		String[] arrOfStr = str.split(" "); //" " - split by spaces
		// String to store the resultant String 
		String result = ""; 
		// Traverse the words and remove the first and last letter 
		for(String a : arrOfStr) { 	//length will start from '1' & index will start from '0'
			result = result + a.substring(1, a.length()-1) + " ";  	//substring(int beginIndex, int endIndex)    1 & a.length()-1 bcz fisrt and last we want to remove
		} 

		return result;  	// return(res)
	} 

	// Driver code 
	public static void main(String args[]) { 
		String str = "abc def"; 
		System.out.println(str); 
		
		System.out.println(FirstAndLast(str)); 

	}   




}     

