package ConstructorConcept;

class A3 {

	B3 tmp; //instance variable

	A3(B3 tmp) {
		this.tmp = tmp;
	}

	void print() {
		System.out.println("The number is : " + tmp.val);
	}
}

class B3 {

	int val = 50; //instance variable

	B3() {
		A3 obj = new A3(this); 
		obj.print();
	}
}

public class thisIsUsedToPasseAsAnArgumentInaConstructorCall {

	public static void main(String[] args) {
		B3 b = new B3();
	}
}
