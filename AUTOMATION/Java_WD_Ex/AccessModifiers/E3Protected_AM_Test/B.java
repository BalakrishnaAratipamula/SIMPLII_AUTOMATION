package E3Protected_AM_Test;

import E3Protected_AM.A;

public class B extends A { //using extends so 'B' is the subclass for 'A' (A- Parent class)
	public static void main(String args[]) {
		B obj = new B();
		obj.msg();
	}
}
