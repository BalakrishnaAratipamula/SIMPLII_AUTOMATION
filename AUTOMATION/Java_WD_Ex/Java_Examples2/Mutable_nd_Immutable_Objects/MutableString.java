package Mutable_nd_Immutable_Objects;

public class MutableString {
	public static void main(String[] args) {

		//StringBuffer
		StringBuffer str1 = new StringBuffer("Java- ");
		System.out.println("Value of str1 before change :" + str1);
		str1.append(" Some text");
		System.out.println("Value of str1 after change :" + str1);

		//StringBuilder
		StringBuilder str2 = new StringBuilder("Demo- ");
		System.out.println("\nValue of str2 before change :" + str2);
		str2.append(" Some text");
		System.out.println("Value of str2 after change :" + str2);

	}
}
