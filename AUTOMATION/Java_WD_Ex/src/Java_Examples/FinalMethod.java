package Java_Examples;

/*/ Class 1
class Bike {	//class declare as Default
	final void run() {
		System.out.println("running");
	}
}

//Class 2
class Honda extends Bike {	//class declare as Default
	void run() { // if method is marked as final we can't override final methods so getting compile time error
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		Honda honda = new Honda();
		honda.run();
	}
} */
