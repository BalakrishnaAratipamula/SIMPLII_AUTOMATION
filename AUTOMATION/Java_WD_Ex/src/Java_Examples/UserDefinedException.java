package Java_Examples;

public class UserDefinedException extends Exception{

	public UserDefinedException(String str){
		super(str);
	} 

	public static void withdraw(int amount) throws UserDefinedException{
		if(amount>2000) {
			throw new UserDefinedException("***user msg: You dont have sufficient amount to withdraw***");
		}
		else {
			System.out.println("please withdraw money");
		}
	} 

	public static void main(String[] args) {
		try {
			withdraw(1000);
		} 
		catch (UserDefinedException e) {
			e.printStackTrace();
		}

		System.out.println("\nThanks for visiting");
	}

}
