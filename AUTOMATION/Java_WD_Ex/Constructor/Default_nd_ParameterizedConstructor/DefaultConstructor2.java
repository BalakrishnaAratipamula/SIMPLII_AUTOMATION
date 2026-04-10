package Default_nd_ParameterizedConstructor;

public class DefaultConstructor2 {
	class Parent {
	    Parent() {
	        System.out.println("Parent constructor");
	    }
	}

	class Child extends Parent {
	    Child() {
	        // super();  // Automatically inserted by Java (Default constructor)
	        System.out.println("Child constructor");
	    }
	}
}
