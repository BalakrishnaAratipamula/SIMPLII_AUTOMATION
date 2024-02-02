package Java_Examples;

class Thread_ExtendingThreadClass extends Thread {
	
	public void run() {
		System.out.println("Thread is under Running...");	//2nd print
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
	}

	public static void main(String args[]) {
		Thread_ExtendingThreadClass t1 = new Thread_ExtendingThreadClass();
		System.out.println("Thread about to start...");		//1st print
		t1.start();
	}
	
}
