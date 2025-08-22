package Java_Examples;

public class AssignmentOperator1 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1==s2); //false
		
		String s3 = "java";
		String s4 = "java";
		
		System.out.println(s3==s4); //true
	}
}
