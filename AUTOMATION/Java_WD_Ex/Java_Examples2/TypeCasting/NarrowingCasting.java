package TypeCasting;

/*Narrowing Casting (manually) - converting a larger type to a smaller size type
  double -> float -> long -> int -> char -> short -> byte */

public class NarrowingCasting {
	/*public static void main(String[] args) {
	    double myDouble = 9.78d;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println("double: "+myDouble);   // Output 9.78
	    System.out.println("int: "+myInt);      // Output 9
	} //*/
	
	 public static void main(String args[]) {
         float f = 3.142f;
         int  i = (int) f;

         System.out.println("float = " +f);
         System.out.println("int = " +i);
    }
}
