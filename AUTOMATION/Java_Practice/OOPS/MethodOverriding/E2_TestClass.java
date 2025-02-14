package MethodOverriding;

//class
class ClassP{
	int xValue = 90;
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Parent Class method:  "+c);
	}
	
	void classPMethod(){
		System.out.println("Praent class method is calling");
	}
}

//class
class ClassC extends ClassP{
	int xValue = 150; //data members overriding is not possible
	
	//Overridden method
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Child Class method:  "+c);
	}
	
	void classCMethod(){
		System.out.println("Child class method is calling");
	}
}

//main class
public class E2_TestClass {
	public static void main(String[] args) {
		/*/Scenario 1
		ClassC obj = new ClassC();
		obj.add(2, 6); //ch
		obj.classCMethod(); //ch
		obj.classPMethod(); //pr
		System.out.println(obj.xValue); //ch //*/
		
		/*/Scenario 2
		ClassP obj = new ClassP(); 
		obj.add(3, 2); //pr
		obj.classPMethod(); //pr
//		obj.classCMethod(); //compile time error due to parent class is not extending the child class
		System.out.println(obj.xValue); //pr //*/
		
		/*/Scenario 3
		ClassP obj = new ClassC(); //UpCast
		obj.add(4, 3); //ch
		obj.classPMethod(); //pr
//		obj.classCMethod();
		System.out.println(obj.xValue); //pr //*/
		
		
		/*/Scenario 4
		ClassC obj = new ClassP(); //compile time error due to we are extending the parent class with child class
		//*/
		
	}
}














