package Java_Examples;

public class Change_LCtoUCandUCtoLC_In_String {	//replace method available only in StringBuffer
	/*/replace() exp
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Welcome to Geeks");
		System.out.println("string buffer = " + sbf);
		//System.out.println(sbf.charAt(1));
		// Replacing substring index 9 to index 10
		sbf.replace(8, 10, "for"); //replace(staring_index, ending_index+1, replacing_string) /////index start from 'zero'
		
		System.out.println("After replacing string buffer = " + sbf);
	} */



	// Method to convert characters of a string to opposite case (Toggle Cases)
	public static void convertOpposite(StringBuffer sb){ 
		// Conversion using predefined/Built in methods
		for (int i=0; i<=sb.length()-1; i++){ 
			Character c = sb.charAt(i);	//or char
			if (Character.isLowerCase(c)) {
				sb.replace(i, i+1, Character.toUpperCase(c)+""); //replace(staring_index, ending_index+1, replacing_string)
			}
			if (Character.isUpperCase(c)) {
				sb.replace(i, i+1, Character.toLowerCase(c)+""); 
			}
		}
	}										   
	//Driver function
	public static void main(String[] args){ 
		StringBuffer sb = new StringBuffer("A bR d"); 
		convertOpposite(sb);  

		System.out.println(sb); 
	} 
	
}
