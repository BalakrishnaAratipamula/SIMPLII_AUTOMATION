package WapperClass;

public class E4_Convert_object_into_primitives {
	public static void main(String args[]) {
		// Converting Integer to int
		Integer a = new Integer(3);
		int i = a.intValue();// converting Integer to int explicitly: Explicit Boxing
		int j = a;// unboxing, now compiler will write a.intValue() internally

		//DataType starts with UpperCase means object and DataType starts with LowerCase means PDT
		System.out.println(a + " " + i + " " + j);
	}
}
