package RuntimeP_or_MethodOverriding;

public class ClassP {
	
	int speedlimit = 90; //Runtime Polymorphism cannot Override data members
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Parent class method: "+c);
	}
	
	public void classPMethod() {
		System.out.println("Parent class method called");
	}
}
