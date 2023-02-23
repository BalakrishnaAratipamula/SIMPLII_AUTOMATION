package AbstractClass;

public abstract class Bank {
	//we can declare any type of variable
	int amt = 100;	//non-static
	final int rate = 10;	//final
	static int loanRate = 5;	//static
	
	public abstract void Loan(); //abstract method /////m1
	public static void Loan2() { /////m2 //Abstract method cannot be declared as a static because we have to Override abstract method 
	}									 //so Overring is not possible with static methods.

	public void Credit() {
		System.out.println("Bank---Credit");
	}

	public void Debit() {
		System.out.println("Bank---Debit");
	}
	 
	/*public static void Debit2() {
		System.out.println("Bank---Debit2");
	} */
}
