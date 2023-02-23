package RuntimeP_or_MethodOverriding;

public class ClassC extends ClassP{
	
	int speedlimit = 150; //Runtime Polymorphism cannot Override data members
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Child class method: "+c);
	}
	
	public void classCMethod() {
		System.out.println("Child class method called");
	}
}
