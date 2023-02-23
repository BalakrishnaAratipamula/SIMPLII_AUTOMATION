package AbstractClass;

public class HDFCBank extends Bank {

	@Override
	public void Loan() { //Overridden method (Override from abstract class)
		System.out.println("HDFCBank.Loan()----Loan");
		
	}
	
	//extra feature only to HDFCBank
	public void Funds() { //non-Overridden method
		System.out.println("HDFCBank----Funds");
	}

}
