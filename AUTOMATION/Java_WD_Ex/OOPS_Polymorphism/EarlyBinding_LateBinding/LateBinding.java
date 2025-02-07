package EarlyBinding_LateBinding;

//Dynamic Binding
class Parent {
	void show() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("Child class method");
	}

}

public class LateBinding {
	public static void main(String[] args) {
		Parent obj = new Child(); // Upcasting
		obj.show(); // Resolved at runtime (late binding)
	}
}
