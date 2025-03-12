package InstanceOf_Operator;

interface Vehicle{
	void car();
}

class implement implements Vehicle{
	@Override
	public void car() {
		
	}
}

public class Instanceof_Operator {
	public static void main(String args[]) {
		Instanceof_Operator obj = new Instanceof_Operator();
		System.out.println(obj instanceof Instanceof_Operator);// true
		
		
		Vehicle obj2 = new implement();
		System.out.println(obj2 instanceof implement);
	}
}
