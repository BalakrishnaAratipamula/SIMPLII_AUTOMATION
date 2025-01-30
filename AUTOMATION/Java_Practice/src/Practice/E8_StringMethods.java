package Practice;

public class E8_StringMethods {
	public static void main(String[] args) {
		String str = "Balakrishna"; 
		String str2_ = "Balakrishna";
		String str3_ = new String("Balakrishna");
		
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
		
		
		
	}
}
