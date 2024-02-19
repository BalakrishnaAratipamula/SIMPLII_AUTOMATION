package Java_Quizs;

public class try_catch_finally3 {
	public static void main(String[] args) {
		try {
			System.out.println("try block stmt");
			System.exit(0);
			//after above stmt JVM will terminates the program 
		}
		catch(Exception e) {
			System.out.println("catch block stmt");
		}
		finally {
			System.out.println("Finally block stmt");
		}
	}
}
