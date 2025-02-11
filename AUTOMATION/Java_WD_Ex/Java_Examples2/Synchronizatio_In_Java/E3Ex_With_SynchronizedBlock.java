package Synchronizatio_In_Java;

class SharedResource3 {
	private int count = 0;

	void increment() {
		synchronized (this) { // Synchronized block
			count++;
		}
	}

	int getCount() {
		return count;
	}
}

public class E3Ex_With_SynchronizedBlock {
	public static void main(String[] args) throws InterruptedException {
		SharedResource3 obj = new SharedResource3();

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
