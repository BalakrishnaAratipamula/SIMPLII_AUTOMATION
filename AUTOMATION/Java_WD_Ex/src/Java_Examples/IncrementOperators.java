package Java_Examples;

public class IncrementOperators {

	volatile int count = 0;	//can take ant variables

	void incrementCount() { //comment one-by-one and then check
		//Pre-increment
/*Exe1*/System.out.println(++count);
//		System.out.println(++count);	//check
/*Exe3*/System.out.println(1+count);
		//Post-increment
/*Exe2*/System.out.println(count++);
//		System.out.println(count++);	//check
//		System.out.println(count++);	//check
//*Exe4*/System.out.println(count+1);
	}

	public static void main(String[] args) {
		IncrementOperators obj = new IncrementOperators();
		obj.incrementCount();
	}

}
