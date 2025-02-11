package EncapuslationEx;

//Encapsulated class
class BankAccount {
	private double balance; //Private variable (cannot be accessed directly)

	// Constructor
	public BankAccount(double initialBalance) { //as a initial balance i want to maintain $500 so i'm passing $500 at the time of constructor calling
		if (initialBalance > 0) {
			this.balance = initialBalance;
		}
	}

	// Getter method (read balance)
	public double getBalance() {
		return balance;
	}

	// Setter method (update balance)
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount; //add in our balance
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	// Method to withdraw money (with validation)
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount; //subtract from our balance
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount!");
		}
	}
}

//main class
public class E2_EncapuslationEx {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(500); // Initial balance: $500

		// Accessing balance via getter
		System.out.println("Current Balance: $" + myAccount.getBalance());

		// Depositing money
		myAccount.deposit(200);
		System.out.println("Balance after deposit: $" + myAccount.getBalance());

		// Withdrawing money
		myAccount.withdraw(100);
		System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

		// Trying invalid withdrawal
		myAccount.withdraw(700);
	}
}
