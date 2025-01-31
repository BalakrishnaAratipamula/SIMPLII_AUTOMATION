package Practice;

import java.util.Arrays;

public class E8_StringMethods {
	public static void main(String[] args) {
		String str = "Balakrishna"; 
		String str2_ = "Balakrishna";
		String str3_ = new String("Balakrishna");
		String str4_ = null;
		String str5_ = " ";
		String str6_ = "";
		String str7_ = "Aratipamula";
		String str6 = " Bhanu Aratipamula ";
		String str7 = "Java tutorial point";
		
		/*/length()
		System.out.println(str.length()); //*/
		
		/*/charAt() //Assume 1st letter is in 0 position, 2nd letter is in 1st position, 3rd letter is in 2nd position.........etc
		System.out.println(str.charAt(0)); 
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2)); 
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(10)); //*/
		
		/*/indexOf()
		System.out.println(str.indexOf("n"));
		System.out.println("character 'i' is in  "+str.indexOf("i")+ "  position"); //*/
		
		/*/toUpperCase()
		System.out.println(str.toUpperCase()); //*/
		
		/*/toLowerCase()
		System.out.println(str.toLowerCase()); //*/
		
		/*/equals - for content comparison
		System.out.println(str.equals("Balakrishna"));	//String str = "Balakrishna"; 
		System.out.println(str.equals("BalakrishNa"));	//String str = "Balakrishna"; 
		System.out.println(str.equals("Balakrishns"));	//String str = "Balakrishna";
		System.out.println(str.equals(str3_)); //*/
		
		/*/Assign is for address/location and content comparison
		System.out.println(str==str3_); //*/
		
		/*/equalsIgnoreCase()
		System.out.println(str.equalsIgnoreCase("balakRishNa")); ////String str = "Balakrishna"; //*/ 
		
		/*/startsWith()
		System.out.println(str.startsWith("Bala")); //String str = "Balakrishna"; //true
		System.out.println(str.startsWith("bala")); //String str = "Balakrishna"; //false
		System.out.println(str.startsWith("shna")); //String str = "Balakrishna"; //false //*/
		
		/*/endsWith()
		System.out.println(str.endsWith("shna")); //String str = "Balakrishna"; 
		System.out.println(str.endsWith("Bala")); //String str = "Balakrishna"; 
		System.out.println(str.endsWith("Shna")); //String str = "Balakrishna";  //*/
		
		/*/contains()
		System.out.println(str.contains("kri")); //String str = "Balakrishna"; 
		System.out.println(str.endsWith("kshna")); //String str = "Balakrishna"; //*/
		
		/*/isEmpty()
		System.out.println(str.isEmpty()); //String str = "Balakrishna"; //false
		System.out.println(str5_.isEmpty()); //String str5_ = " "; //false
		System.out.println(str6_.isEmpty()); //String str6_ = ""; //true
		System.out.println(str4_.isEmpty()); //String str4_ = null; //throw null pointer Exception //*/
		
		/*/concat()
		System.out.println(str.concat(str7_)); //*/
		
		/*/trim()
		System.out.println(str6.length()); //Retrieving length
		System.out.println(str6.trim().length()); //printing length after trimming spaces //*/
		
		/*/replace()
		System.out.println(str.replace("i", "O")); //String str = "Balakrishna"; //*/
		
		/*/replaceAll()
		String str_ = str.toLowerCase().replaceAll("a", "U");
		System.out.println(str_); //*/
		
		/*/replaceFirst()
		String str_ = str.toLowerCase().replaceFirst("a", "@");
		System.out.println(str_); //*/
		
		/*/subString()
		System.out.println(str.substring(3)); //index //String str = "Balakrishna"; 
		System.out.println(str.substring(7)); //index //String str = "Balakrishna"; //*/
		
		//split()
		String[] newString = str6.split(" ");
		System.out.println(Arrays.toString(newString));
		
		String[] newString2 = str7.split(" ");//String str7 = "Java tutorial point";
		System.out.println(Arrays.toString(newString2));
		
	}
}
