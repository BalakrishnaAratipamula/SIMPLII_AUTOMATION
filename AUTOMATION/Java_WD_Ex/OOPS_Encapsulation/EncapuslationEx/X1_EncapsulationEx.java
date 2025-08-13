package EncapuslationEx;

class BankAccount2 {
	// Private variables (data hiding)
	private String accountHolder;
	private double balance;

	// Constructor
	public BankAccount2(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	// Getter
	public String getAccountHolder() {
		return accountHolder;
	}
	
	// Setter
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	// Getter with logic
	public double getBalance() {
		return balance;
	}

	// Setter with validation
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid deposit amount");
		}
	}
}

public class X1_EncapsulationEx {
	public static void main(String[] args) {
		BankAccount2 acc = new BankAccount2("John", 1000);

		// Access data using methods, not directly
		System.out.println("Account Holder: " + acc.getAccountHolder());
		System.out.println("Balance: " + acc.getBalance());
		
		acc.deposit(500); // Valid
		System.out.println("Updated Balance: " + acc.getBalance());
	}
}
