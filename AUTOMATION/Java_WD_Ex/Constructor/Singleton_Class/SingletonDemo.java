package Singleton_Class;

class SingletonClass {
//A Singleton class is a class that allows only one instance of itself to be created and provides a global point of access to that instance
	private static SingletonClass single_instance = null;
	public int i;

	private SingletonClass() {
		i = 10;
	}

	// Static method to create instance of Singleton class
	public static SingletonClass getInstance() {
		if (single_instance == null)
			single_instance = new SingletonClass();

		return single_instance;
	}
}

public class SingletonDemo {
	public static void main(String args[]) {
		SingletonClass one = SingletonClass.getInstance();
		one.i = 50;
		System.out.println("Print Value of i using object one :" + one.i);

		SingletonClass two = SingletonClass.getInstance();
		two.i = 100;
		System.out.println("Print Value of i using object two :" + two.i);

		if (one == two) {
			System.out.println("one and two both objects are same");
		}
	}
}
