package Java_Examples;

public class AssignmentOperator_nd_equals {
	public static void main(String[] args){

		String s1 = "Test";	//allocate address in java common memory
		String s2 = "Test"; //allocate address in java common memory
		String s3 = new String("Test");	//s3-address , "Test"-content ////allocate address in new memory (heap space) bcz new operator is used
		
		//== is for address/Reference comparison
		System.out.println(s1 == s2); // prints true
		System.out.println(s1 == s3); // prints false
		System.out.println(s3 == s3); // prints true
		
		//equals() is for content comparison
		System.out.println(s1.equals(s2)); // prints true
		System.out.println(s1.equals(s3)); // prints true

	}
}
