package Singleton_Class;

public class SingletonDesignPattern2 {
	private static SingletonDesignPattern2 instance = new SingletonDesignPattern2();
	private SingletonDesignPattern2() {}
	public static SingletonDesignPattern2 getInstance() {
		return instance;
	}
	
}
