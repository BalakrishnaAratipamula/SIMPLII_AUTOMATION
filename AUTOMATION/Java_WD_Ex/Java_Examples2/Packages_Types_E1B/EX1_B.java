package Packages_Types_E1B;		//user-define package

import Packages_Types_E1A.EX1_A;	// importing user-define package	

public class EX1_B {
	
	public static void main(String[] args) {
		System.out.println("Hello there i am class EX1_B");
		
		EX1_A obj = new EX1_A();
		obj.methodClassTwo();
	}
}
