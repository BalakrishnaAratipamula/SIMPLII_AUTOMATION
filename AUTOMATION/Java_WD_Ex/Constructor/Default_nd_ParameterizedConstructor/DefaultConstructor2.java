package Default_nd_ParameterizedConstructor;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class DefaultConstructor2 {
	public static void main(String[] args) {
		new Child();
	}
}
