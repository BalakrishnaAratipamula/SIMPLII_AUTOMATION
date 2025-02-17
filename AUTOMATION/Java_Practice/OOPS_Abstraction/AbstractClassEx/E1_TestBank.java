package AbstractClassEx;

public class E1_TestBank {
	public static void main(String[] args) {
		/*/Scenario 1
		E1_HDFCBank hb = new E1_HDFCBank();
		hb.credit(); //pr
		hb.debit(); //pr
		hb.loan1(); //ch
		hb.funds(); //ch //*/
		
		/*/Scenario 2
		E1_Bank b = new E1_HDFCBank(); //-- UC
		b.credit(); //pr
		b.debit(); //pr
		b.loan1(); //ch
//		b.loan2(); //warning bcz it is a static
//		b.funds(); //funds() is only belongs to Child class //*/
		
		/*/Scenario 3
		E1_Bank b = new E1_Bank(); //*///we can't able to instantiate the abstract class
	}
}
