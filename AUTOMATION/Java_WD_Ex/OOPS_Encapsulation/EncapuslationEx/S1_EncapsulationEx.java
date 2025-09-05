package EncapuslationEx;

class BankAccount3 {
	// Private data members (data hiding)
	private String accountHolder;
	private double balance;
	
	// Constructor
	public BankAccount3(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	// Getter (read-only access)
	public double getBalance() {
		return balance;
	}

	// Setter with validation (controlled access)
	public void deposit(double amount) {
		if (amount > 0) 
			balance += amount;
		else 
			System.out.println("Invalid deposit amount!");
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) 
			balance -= amount;
		else 
			System.out.println("Invalid or insufficient funds!");
	}
}

public class S1_EncapsulationEx {
	public static void main(String[] args) {
		BankAccount3 acc = new BankAccount3("Balakrishna", 1000);

		acc.deposit(500); // Allowed through method
		acc.withdraw(200); // Allowed through method

		System.out.println("Balance: " + acc.getBalance());
		
		// ❌ Direct access not allowed
		// acc.balance = 100000; // Compilation error
	}
}
