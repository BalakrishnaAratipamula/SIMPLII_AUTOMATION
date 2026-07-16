package Interface;

interface Vehicle2 {
    void start();
}

class Car2 implements Vehicle2 {
    public void start() {
        System.out.println("Car2 starts");
    }
}

public class UsingInterface_As_ReferenceType2 {
	public static void main(String[] args) {
        Vehicle2 v = new Car2();  // Interface reference
        v.start();
    }
}
