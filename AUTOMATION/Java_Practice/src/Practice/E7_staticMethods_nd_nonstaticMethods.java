package Practice;

public class E7_staticMethods_nd_nonstaticMethods {
	//////// non-static method
	public void m1() { // method with 'public' Access modifiers
		System.out.println("m1() is calling - nsm");
	}

	private void m2() { // method with 'private' Access modifiers
		System.out.println("m2() is calling - nsm");
	}

	void m3() { // method with 'default' Access modifiers
		System.out.println("m3() is calling - nsm");
	}

	protected void m4() { // method with 'protected' Access modifiers
		System.out.println("m4() is calling - nsm");
	}

	//////// static method
	public static void m5() { // method with 'public' Access modifiers
		System.out.println("m5() is calling - sm");
	}

	private static void m6() { // method with 'private' Access modifiers
		System.out.println("m6() is calling -sm");
	}

	static void m7() { // method with 'default' Access modifiers
		System.out.println("m7() is calling - sm");
	}

	protected static void m8() { // method with 'protected' Access modifiers
		System.out.println("m8() is calling - sm");
	}

	// main method
	public static void main(String[] args) {
		E7_staticMethods_nd_nonstaticMethods obj = new E7_staticMethods_nd_nonstaticMethods();
		// calling non-static methods: to call non-static methods we need to use class reference
		System.out.println("Printing non-static methods **************");
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		
		// calling static methods: to call static methods we need to use class name
		System.out.println("Printing static methods **************");
		E7_staticMethods_nd_nonstaticMethods.m5();
		E7_staticMethods_nd_nonstaticMethods.m6();
		E7_staticMethods_nd_nonstaticMethods.m7();
		E7_staticMethods_nd_nonstaticMethods.m8();
	}

}
