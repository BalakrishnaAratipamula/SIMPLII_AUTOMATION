package Packages_Types_E1A;		//user-define package

import java.util.ArrayList;		//Built-in package	ex:: Java.util, Java.io, Java.lang

public class EX1_A {
	
	public void methodClassTwo(){ 
        System.out.println("Hello there i am class EX1_A"); 
    }
	
	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
		System.out.println(n);
	}
	
}
