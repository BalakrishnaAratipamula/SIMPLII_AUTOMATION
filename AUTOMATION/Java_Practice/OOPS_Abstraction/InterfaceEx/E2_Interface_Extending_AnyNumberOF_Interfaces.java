package InterfaceEx;

interface A{
	void method_A();
} 

interface B{
	void method_B();
} 

interface C extends A, B{ //we can extends n-numver of interfaces
	void method_C();
} 

//concrete class
class myClass implements C{

	@Override
	public void method_A() {
		System.out.println("Implemented method_A");
	}

	@Override
	public void method_B() {
		System.out.println("Implemented method_B");
	}

	@Override
	public void method_C() {
		System.out.println("Implemented method_C");
	}
	
}

//main class
public class E2_Interface_Extending_AnyNumberOF_Interfaces {
	public static void main(String[] args) {
		myClass obj = new myClass();
		obj.method_A();
		obj.method_B();
		obj.method_C();
	}
}
