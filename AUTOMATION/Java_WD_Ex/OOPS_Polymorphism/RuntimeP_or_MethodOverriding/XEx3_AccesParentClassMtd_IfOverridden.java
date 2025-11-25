package RuntimeP_or_MethodOverriding;

class Parent {
	void show() {System.out.println("Parent");}
}

class Child extends Parent{
	void show() {
		super.show();
		System.out.println("Child");
	}
}

public class XEx3_AccesParentClassMtd_IfOverridden {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();
	}
}
