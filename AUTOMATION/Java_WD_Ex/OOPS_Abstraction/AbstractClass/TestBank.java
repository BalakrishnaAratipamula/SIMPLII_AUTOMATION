package AbstractClass;

public class TestBank {
	public static void main(String[] args) {
	/*/1st scenario --- 
	HDFCBank hb = new HDFCBank();
	hb.Credit(); 
	hb.Debit(); 
	//Debit2();
	hb.Loan1(); //ch //Access bcz it is Overridden method
	//Loan2();
	hb.Funds(); //*/
	
	/*/2nd scenario (this concept is called Dynamic Polymorphism) --- UC
	Bank b = new HDFCBank(); //'new HDFCBank()' referd by 'Bank' class obj ///shortcut: can able to access ist class mentioned methods only
	b.Credit(); 
	b.Debit(); 
	//Bank.Debit2(); ///(or) HDFCBank.Debt2() ----both will print parent class method only
	b.Loan1(); //ch
//	b.Loan2();
	//b.Funds();  //--not allow to access bcz 'Funds' method is only part of HDFCBank //*/
    
	/*/3rd scenario --- DC
	Bank b = new Bank(); //---- bcz obj cannot be create to Abstract class //*/
	}
}
