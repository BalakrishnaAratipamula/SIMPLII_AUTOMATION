package EncapsulationEx;

//class
class BankAccount {
	private double balance; //private variable (cannot be accessed directly)
	
	//to initializing the initial amount
	public BankAccount(double balance) {
		this.balance=balance; //initializing local variable with class level variable
	}
	
	//Getter method (to read balance)
	public double getBalance() {
		return balance;
	}
	
	//Setter method (to update balance)
	public void deposit(double amount) {
		if(amount > 0) {
			balance +=amount; //balance = balance+amount;
			System.out.println("Deposited: $"+amount);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	//method to withdraw money
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -=amount;
			System.out.println("Withdraw: $"+amount);
		}
		else {
			System.out.println("Insufficient balance or invalid amount!");
		}
	}
	
}


//main class
public class E2_EncapsulationEx{
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(500); //initial balance: 500
	
		//Accessing balance via getter method
		System.out.println("Current balance: $"+myAccount.getBalance());
		
		//Depositing money
		myAccount.deposit(200);
		System.out.println("Current balance: $"+myAccount.getBalance());
		
		//Depositing money
		myAccount.withdraw(100);
		System.out.println("Current balance: $"+myAccount.getBalance());
		
		//trying invalid withdraw
		myAccount.withdraw(1000);
	}
}







