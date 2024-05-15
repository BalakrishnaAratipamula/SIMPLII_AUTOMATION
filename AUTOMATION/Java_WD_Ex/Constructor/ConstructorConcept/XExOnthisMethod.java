package ConstructorConcept;

class Fruits{
	public Fruits() {
		System.out.println("not parameterized constructor");
	}

	Fruits(int x){
		this();	//this() kw is used to call current class constructor ////We cannot use super() and this() keywords together in a constructor 
		System.out.println("parameterized constructor");
	}
}
public class XExOnthisMethod {
	public static void main(String[] args) {
		Fruits ec2 = new Fruits(8);
	}
}
