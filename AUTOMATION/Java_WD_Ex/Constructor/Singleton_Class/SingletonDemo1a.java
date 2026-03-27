package Singleton_Class;

class Singleton2 {
    private static volatile Singleton2 instance;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}

public class SingletonDemo1a {
	public static void main(String[] args) {
        Singleton2 obj1 = Singleton2.getInstance();
        Singleton2 obj2 = Singleton2.getInstance();

        System.out.println(obj1 == obj2); // true
    }
}
