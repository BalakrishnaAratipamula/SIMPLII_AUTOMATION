package Interface;

interface A3 {
	void methodA3();
}

interface B3 {
	void methodB3();
}

interface C3 extends A3, B3 { // Interface C extends both A and B interfaces
	void methodC3();
}

class MyClass implements C3 {
    @Override
    public void methodA3() {
        System.out.println("Implementing methodA3");
    }

    @Override
    public void methodB3() {
        System.out.println("Implementing methodB3");
    }

    @Override
    public void methodC3() {
        System.out.println("Implementing methodC");
    }
}

public class Interface_Extending_Any_NumOf_Interfaces {
	public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA3();
        obj.methodB3();
        obj.methodC3();
    }
}
