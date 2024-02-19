package Java_Quizs;

public class try_catch_finally {
	
	//@SuppressWarnings("finally")
	static int anyMethod() {
		try {
			return 10;
		}
		catch(Exception e) {
			return 20;
		}
		finally {
			return 30;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(anyMethod());
	}
}
