package Java_Examples;

public class StringBufferClass_DsntOverrideTheEqualsMethodOf_ObjClass {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		System.out.println(sb1.equals(sb2)); // false (different objects)
		System.out.println(sb1 == sb2);      // false (different references)
		System.out.println(sb1.toString().equals(sb2.toString())); // true (same content)

	}
}
