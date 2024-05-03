package Thread;

class ByImplementingRunnableInterface implements Runnable {
	
	public void run() {
		System.out.println("Thread is under Running...");	//2nd print
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
	}

	public static void main(String[] args) {
		ByImplementingRunnableInterface iri = new ByImplementingRunnableInterface();
		Thread thread = new Thread(iri);
		System.out.println("Thread about to start...");		//1st print
		thread.start();
	}
	
}