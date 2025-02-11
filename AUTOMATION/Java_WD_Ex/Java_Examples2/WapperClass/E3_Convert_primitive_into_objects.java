package WapperClass;

public class E3_Convert_primitive_into_objects {
	// Ex1
	public static void main(String args[]) {
		// primitive data type
		int a = 20;
		//Wrapper class object
		Integer i = Integer.valueOf(a); //converting int into Integer explicitly: Explicit Boxing
		Integer j = a; //Auto-boxing, now compiler will write Integer.valueOf(a) internally

		//DataType starts with UpperCase means object and DataType starts with LowerCase means PDT
		System.out.println(a + " " + i + " " + j); 
	} //*/
	
	
	/*/ Ex2
	public static void main(String[] args) {
       // Converting primitive types to objects (Boxing)
       Integer intObj = Integer.valueOf(10);  // Explicit Boxing
       Double doubleObj = 20.5;               // Auto-boxing

       // Converting objects to primitive types (Unboxing)
       int intVal = intObj.intValue();        // Explicit Unboxing
       double doubleVal = doubleObj;          // Auto-unboxing

       // Printing values
       System.out.println("Integer Object: " + intObj);
       System.out.println("Double Object: " + doubleObj);
       System.out.println("Unboxed Integer: " + intVal);
       System.out.println("Unboxed Double: " + doubleVal);
    } //*/
	
	
}
