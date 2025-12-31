package Interface;

//@. We have 2 interfaces and we declare 4 methods in the 1st interface and 2 methods in 2nd interface and now we are implementing those 2 interfaces in our class. We want to implement only a few declared methods from those 2 interfaces so how do we deal this?

interface InterfaceA {
	void method1();

	void method2();

	void method3();

	void method4();
}

interface InterfaceB {
	void method5();

	void method6();
}
/*
public class InterviewQns implements InterfaceA, InterfaceB {
	// Implement only the methods you want
	@Override
	public void method1() {
		System.out.println("Implemented method1");
	}

	@Override
	public void method5() {
		System.out.println("Implemented method5");
	} 
	// Other methods remain unimplemented → subclass must implement them
} //*/
