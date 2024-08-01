package Java_Examples;

class VolatileEx {

	volatile int count=0;
	
	void incrementCount() {
		count++;
	}
	
	void displayCount() {
		System.out.println("count: "+count);
	}
}

public class VolatileExample {
	public static void main(String[] args) {
		VolatileEx obj = new VolatileEx();
		obj.incrementCount();
		obj.displayCount();
	}
}