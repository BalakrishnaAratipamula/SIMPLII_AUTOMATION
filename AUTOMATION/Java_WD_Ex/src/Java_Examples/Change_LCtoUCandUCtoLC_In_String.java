package Java_Examples;

public class Change_LCtoUCandUCtoLC_In_String {
	/*/replace() exp
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Welcome to Geeks");
		System.out.println("string buffer = " + sbf);
		//System.out.println(sbf.charAt(1));
		// Replacing substring index 9 to index 10
		sbf.replace(8, 10, "for"); //replace(staring_index, ending_index+1, replacing_string) /////index start from 'zero'

		System.out.println("After replacing string buffer= " + sbf);
	} */



	// Method to convert characters of a string to opposite case 
	public static void convertOpposite(StringBuffer sb){ 
		int ln = sb.length();    
		System.out.println("Length of the String is: "+ln);
		// Conversion using predefined/Built in methods
		for (int i=0; i<ln; i++){ 
			Character c = sb.charAt(i);	//or char
			if (Character.isLowerCase(c)) 
				sb.replace(i, i+1, Character.toUpperCase(c)+" "); //public StringBuffer replace(staring_index, ending_index+1, replacing_string)
			else
				sb.replace(i, i+1, Character.toLowerCase(c)+""); 
		} 
		//System.out.print(sb); 
	}   														   
	//Driver function
	public static void main(String[] args){ 
		StringBuffer strb = new StringBuffer("A b"); 

		convertOpposite(strb);  

		System.out.println(strb); 
	} 

}
