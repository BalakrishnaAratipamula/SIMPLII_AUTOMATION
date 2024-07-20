package Java_Examples;

public class AssignmentOperator_nd_equals {
	public static void main(String[] args){

		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");	//s3-address , "Test"-content
		
		//== is for address/Reference comparison
		System.out.println(s1 == s2); // prints true
		System.out.println(s1 == s3); // prints false
		System.out.println(s3 == s3); // prints true
		
		//equals() is for content comparison
		System.out.println(s1.equals(s2)); // prints true
		System.out.println(s1.equals(s3)); // prints true

	}
}
