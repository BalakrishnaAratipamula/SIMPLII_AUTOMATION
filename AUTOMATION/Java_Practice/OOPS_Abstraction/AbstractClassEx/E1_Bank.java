package AbstractClassEx;

public abstract class E1_Bank { //abstract class allow - public, default
	//class level variables
	int amt = 100; //non-static var (instance variable)
	final int rate = 10; //final var
	static int loanRate = 5; //satic var
	
	//Abstract method
	public abstract void loan1();
	
	public static void loan2() {}; //non-abstract method
	
	public void credit() {
		System.out.println("credit() from E1_Bank class");
	}
	
	public void debit() {
		System.out.println("debit() from E1_Bank class");
	}
}
