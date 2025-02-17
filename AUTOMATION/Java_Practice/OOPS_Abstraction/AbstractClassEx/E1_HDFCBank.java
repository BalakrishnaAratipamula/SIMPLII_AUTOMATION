package AbstractClassEx;

public class E1_HDFCBank extends E1_Bank{

	//implementing Abstract method
	@Override
	public void loan1() {
		System.out.println("loan1() implemented abstract method from HDFCBank class");
	}
	
	public void funds() {
		System.out.println("funds() from HDFCBank class");
	}

}
