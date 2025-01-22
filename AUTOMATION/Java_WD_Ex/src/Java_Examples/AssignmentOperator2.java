package Java_Examples;

public class AssignmentOperator2 { 
	//'assign' is to compare both 'address and content' where 'equal' is for 'content' comparison
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";
		String s4 = "hai";
		
		if(s1==s2) { 
			System.out.println("s1 and s2 equal");
		} else {
			System.out.println("s1 and s2 not equal");
		}
		
		if(s1==s3) {
			System.out.println("s1 and s3 equal");
		} else {
			System.out.println("s1 and s3 not equal");
		}

		if(s1==s4) {
			System.out.println("s1 and s4 equal");
		} else {
			System.out.println("s1 and s4 not equal");
		}
	}
}
