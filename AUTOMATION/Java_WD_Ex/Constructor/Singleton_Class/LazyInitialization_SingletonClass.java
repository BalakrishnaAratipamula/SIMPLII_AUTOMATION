package Singleton_Class;

//Examples of Singleton Class is : Lazy initialization
public class LazyInitialization_SingletonClass { //A private constructor and static method is used to create a singleton class
	
	private static LazyInitialization_SingletonClass instance;
	
	private LazyInitialization_SingletonClass() {
		// Private constructor to prevent external instantiation
	}
	
	public static LazyInitialization_SingletonClass getInstance() {
		if(instance==null) {
			instance = new LazyInitialization_SingletonClass();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		LazyInitialization_SingletonClass obj1 = LazyInitialization_SingletonClass.getInstance();
		LazyInitialization_SingletonClass obj2 = LazyInitialization_SingletonClass.getInstance();
		if(obj1==obj2) {
			System.out.println("Both objects are the same instance");
		}
	}
}
