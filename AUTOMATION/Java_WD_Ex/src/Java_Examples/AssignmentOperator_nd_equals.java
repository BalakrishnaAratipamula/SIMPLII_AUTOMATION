package Java_Examples;

public class AssignmentOperator_nd_equals {
	public static void main(String[] args){
		
		String s1 = "Test";	//allocate address in java common memory
		String s2 = "Test"; //allocate address in java common memory
		String s2b = "TestT"; //allocate address in java common memory
		String s3 = new String("Test");	//s3-address , "Test"-content ////allocate address in new memory (heap space) bcz new operator is used
		
		//N: s1, s2, s2b will store in java common memory (SC Pool) & s3 will store in new memory (heap)
		
		//== is for memory Address/Reference of objects and content comparison
		System.out.println(s1 == s2); // true - both point to the same object in the String Constant Pool and content same
		System.out.println(s1 == s3); // false - both point to the diff object in the String Constant Pool and content same
		System.out.println(s1 == s2b); // false - address is same and content is diff
		System.out.println(s2 == s2b); // false - both point to the same object in the String Constant Pool and content diff
		System.out.println(s3 == s3); // true - both address and content same
		
		//equals() is for only content(value) of objects comparison
		System.out.println(s1.equals(s2)); // true - both content same
		System.out.println(s1.equals(s1)); // true - both content same
		System.out.println(s1.equals(s2b)); // false - both content diff
		System.out.println(s1.equals(s3)); // true - both content same
	}
}
