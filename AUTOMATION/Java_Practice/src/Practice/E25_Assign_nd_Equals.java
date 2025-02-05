package Practice;

public class E25_Assign_nd_Equals {
	public static void main(String[] args) {
		String str1 = "Tutorial";
		String str2 = "Tutorial";
		String str3 = new String("Tutorial"); //in case if we don't use 'new' keyword String content will get store in java common memory.
											 //if we use 'new' keyword String content will get store in new memory (heap space).
		
		System.out.println(str1==str2); //true //Assign is for address and content comparison
		System.out.println(str1==str3); //false
		System.out.println(str1.equals(str2)); //true //equal is for only content comparison
		System.out.println(str1.equals(str3)); //true
	}
}
