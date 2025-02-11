package Synchronizatio_In_Java;

class SharedResource2 {
	private int count = 0;

	synchronized void increment() { // Synchronized method
		count++;
	}

	int getCount() {
		return count;
	}
}

public class E2Ex_With_SynchronizedMethod {
	public static void main(String[] args) throws InterruptedException {
		SharedResource2 obj = new SharedResource2();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				obj.increment();
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				obj.increment();
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("Final Count: " + obj.getCount()); // Always 2000 ✅
	}
}
