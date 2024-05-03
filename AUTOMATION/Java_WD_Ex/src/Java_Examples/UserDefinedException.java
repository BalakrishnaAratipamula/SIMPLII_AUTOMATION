package Java_Examples;

//First of all, the user should create an exception class as a subclass of Exception class. All the exceptions are the... 
//...subclasses of Exception class. 
public class UserDefinedException extends Exception {	//Exception class internally extends Throwable class
	// Create a parameterized constructor with a string as a parameter to store
	// exception details. We call super class...
	// ...constructor from this and send the string there.
	public UserDefinedException(String str) {
		super(str);	//calling super class constructor
	}

	public static void main(String[] args) {
		try {
			withdraw(5000);
		} 
		catch (UserDefinedException e) {
			e.printStackTrace();
		}

		System.out.println("\nThanks for visiting");
	}

	public static void withdraw(int amount) throws UserDefinedException {
		if (amount > 2000) {
			// Finally, to raise exception as user-defined type, we have to create an object
			// to our exception class and...
			// ...throw it using throw class.
			throw new UserDefinedException("***User Defined msg: You dont have sufficient amount to withdraw***");
		} else {
			System.out.println("please withdraw money");
		}
	}

}
