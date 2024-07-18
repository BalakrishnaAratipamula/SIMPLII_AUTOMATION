package TypeCasting;

/*Widening Casting (automatically) - converting a smaller type to a larger type size
  byte -> short -> char -> int -> long -> float -> double */

public class WideningCasting {
	/*public static void main(String[] args) {
	    int myInt = 9;
	    double myDouble = myInt;	// Automatic casting: int to double

	    System.out.println("int: "+myInt);      // Output 9
	    System.out.println("double: "+myDouble);   // Output 9.0
	} //*/
	
	public static void main(String args[]) {
        int i = 10;
        float f = i;
        
        System.out.println("int: " +i);
        System.out.println("float: " +f);
	}
	
}
