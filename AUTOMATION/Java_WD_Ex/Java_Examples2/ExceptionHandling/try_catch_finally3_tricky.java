package ExceptionHandling;

//Try block has exit method, catch block has exception and finally block is returning an int value. Can you explain the flow of execution?
public class try_catch_finally3_tricky {
	static int test() {
		try {
			System.out.println("try");
			System.exit(2); //1 //at this line execution will get stop because 'System.exit()' is specified
		}
		catch(Exception e){
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
            return 1;	//1
		}
	}
	
	public static void main(String[] args) {
		test();
	}
}
