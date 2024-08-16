package Object_nd_Instance;

public class ObjectEx {
	String name;
	int age;

	public void sayHello() {
		System.out.println("My name is " + name + " and I'm " + age + " years old.");
	}

	// main function
	public static void main(String[] args) {
		ObjectEx obj1 = new ObjectEx();
		obj1.name = "Bala";
		obj1.age = 27;
		obj1.sayHello();

		ObjectEx obj2 = new ObjectEx();
		obj2.name = "Ramesh";
		obj2.age = 32;
		obj2.sayHello();
	}
}
