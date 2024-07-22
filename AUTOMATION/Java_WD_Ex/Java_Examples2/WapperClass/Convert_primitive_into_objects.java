package WapperClass;

public class Convert_primitive_into_objects {
	public static void main(String args[]) {
		// Converting int into Integer
		int a = 20;
		Integer i = Integer.valueOf(a); //converting int into Integer explicitly
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally

		//DataType starts with UpperCase means object and DataType starts with LowerCase means PDT
		System.out.println(a + " " + i + " " + j); 
	}
}
