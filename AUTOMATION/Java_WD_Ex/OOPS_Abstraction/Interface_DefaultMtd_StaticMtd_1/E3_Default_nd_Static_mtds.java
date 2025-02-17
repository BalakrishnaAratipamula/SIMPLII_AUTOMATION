package Interface_DefaultMtd_StaticMtd_1;

interface Animal3 {
	int weight = 40; //by default it will consider as public

	void eat();

	void sleep();

	default void dog3() {
		System.out.println("dog is sleeping");
	}

	static String cat3(String str) {
		System.out.println("cat is sleeping");
		return str;
	}
}

public class E3_Default_nd_Static_mtds implements Animal3 {

	@Override
	public void eat() {
		System.out.println("overriden eat()");
	}

	@Override
	public void sleep() {
		System.out.println("overriden sleep()");
	}

	public static void main(String[] args) {
		E3_Default_nd_Static_mtds obj = new E3_Default_nd_Static_mtds();
		obj.dog3();
		Animal3.cat3("abc");
		System.out.println(weight);
	}
}
