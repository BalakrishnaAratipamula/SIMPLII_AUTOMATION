package Practice;

public class E32_throw {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException("'Throwing ArithmeticException from try block'"); //throw- throw clause keyword, new ArithmeticException()- is a object for 'ArithmeticException' class
		} catch(ArithmeticException ae){
			ae.printStackTrace();
		}
	}
}
