package Java_Examples;

public class IncrementOperators {

	volatile int count = 0;	//can take ant variables

	void incrementCount() { //comment one-by-one and then check
		//Pre-increment
		System.out.println(++count);
		//Post-increment
		System.out.println(count++);
	}

	public static void main(String[] args) {
		IncrementOperators obj = new IncrementOperators();
		obj.incrementCount();
	}

}
