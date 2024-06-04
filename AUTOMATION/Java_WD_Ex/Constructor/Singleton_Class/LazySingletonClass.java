package Singleton_Class;

//Examples of Singleton Class is : Lazy initialization
public class LazySingletonClass {
	
	private static LazySingletonClass instance;
	
	private LazySingletonClass() {
		// Private constructor to prevent external instantiation
	}
	
	public static LazySingletonClass getInstance() {
		if(instance==null) {
			instance = new LazySingletonClass();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		LazySingletonClass obj1 = LazySingletonClass.getInstance();
		LazySingletonClass obj2 = LazySingletonClass.getInstance();
		if(obj1==obj2) {
			System.out.println("Both objects are the same instance");
		}
	}
}
