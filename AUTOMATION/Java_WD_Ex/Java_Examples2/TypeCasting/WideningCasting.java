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
	
	/*public static void main(String args[]) {
        int i = 10;
        float f = i;
        
        System.out.println("int: " +i);
        System.out.println("float: " +f);
	} //*/
	
	/*/String to int
	public static void main(String args[]) {
		String s = "200";
		int i = Integer.parseInt(s);
		
		System.out.println(i);
	} //*/
	
	/*/int to String  
	public static void main(String args[]) {
		int i = 200;
		String str = String.valueOf(i);		
		System.out.println(str);
	} //*/
	
	public static void main(String[] args) {
        int num = 10;
        double d = num;  // int → double (automatic)
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + d);
    }
}
