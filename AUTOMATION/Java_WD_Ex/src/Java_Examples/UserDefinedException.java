package Java_Examples;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class UserDefinedException {
	public static void main(String[] args) {
        try {
            throw new MyException("Custom exception occurred");
//            System.out.println("After using throws keyword next statement will give compilation error");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
