package Thread;

class ByExtendingThreadClass extends Thread {
	
	public void run() {
		System.out.println("Thread is under Running...");	//2nd print
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
	}

	public static void main(String args[]) {
		ByExtendingThreadClass t1 = new ByExtendingThreadClass();
		System.out.println("Thread about to start...");		//1st print
		t1.start();
	}
	
}
