package E3Protected_AM_Test;

import E3Protected_AM.A;

public class B extends A { //making relationship between class B and class A
	public static void main(String[] args) {
		B obj = new B(); //creating object to subclass/ child class/ derived class
		obj.msg(); 
//		obj.msg2(); //compile time error: bcz class 'A2' doesn't have any relationship with class 'B'
	}
}


