package Interface;

interface A3 {
	void methodA3();
}

interface B {
	void methodB();
}

interface C extends A3, B { // Interface C extends both A and B interfaces
	void methodC();
}

class MyClass implements C {
    @Override
    public void methodA3() {
        System.out.println("Implementing methodA3");
    }

    @Override
    public void methodB() {
        System.out.println("Implementing methodB");
    }

    @Override
    public void methodC() {
        System.out.println("Implementing methodC");
    }
}

public class Interface_Extending_Any_NumOf_Interfaces {
	public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA3();
        obj.methodB();
        obj.methodC();
    }
}
