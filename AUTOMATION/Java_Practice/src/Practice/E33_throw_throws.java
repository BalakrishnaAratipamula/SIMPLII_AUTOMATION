package Practice;

public class E33_throw_throws {
	public static void checkNumber(int num) throws Exception, ArithmeticException, NumberFormatException {
		if(num<=5) 
			throw new Exception("Number is lessthan or equal to 5!");
		else
			System.out.println("Number is greaterthan 5");
	}
	
	public static void main(String[] args) throws Exception, ArithmeticException, NumberFormatException {
		try {
			checkNumber(2);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
