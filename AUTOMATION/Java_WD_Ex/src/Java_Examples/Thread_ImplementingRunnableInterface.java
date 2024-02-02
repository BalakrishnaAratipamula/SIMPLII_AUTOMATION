package Java_Examples;

class Thread_ImplementingRunnableInterface implements Runnable {
	
	public void run() {
		System.out.println("Thread is under Running...");	//2nd print
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
	}

	public static void main(String[] args) {
		Thread_ImplementingRunnableInterface threadObject = new Thread_ImplementingRunnableInterface();
		Thread thread = new Thread(threadObject);
		System.out.println("Thread about to start...");		//1st print
		thread.start();
	}
	
}