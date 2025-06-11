package Java_Quizs;

import java.lang.*;

public class try_catch_finally2 {
	
//	@SuppressWarnings("finally")
	static int anyMethod() {
		int i=1;
		try {
			i=i+1;	//2
			return i;
		}
		catch(Exception e) {
			i=i+2;
		}
		finally {
			i=i+3;	//5 //final block doesn't have return stmt so try block stmt only will prints
		}
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println(anyMethod());
	}
}
