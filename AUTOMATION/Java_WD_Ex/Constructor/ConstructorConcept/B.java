package ConstructorConcept;

// EX5 - to pass as an argument in the constructor call
class A {
	B obj;
	A(B obj) {
		this.obj = obj;
		obj.display();
		System.out.println("BBBBBBB - A()");  //3 call
	}
}

class B {
	int x = 5;
	B() {
		A obj = new A(this); ////// to pass as an argument in the constructor call
		System.out.println("BBBBBBB - B()");  //4 call
	}

	void display() {
		System.out.println("value of x in class B:  " + x);	 //2 call
	}

	public static void main(String[] args) {
		System.out.println("BBBBBBB - main()");	 //1 call
		B obj = new B();
	}
}
