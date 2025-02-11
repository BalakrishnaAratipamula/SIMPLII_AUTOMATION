package Synchronizatio_In_Java;

class SharedResource {
	int count = 0;

	void increment() { // No synchronization
		count++;
	}
}

public class E1Ex_Without_Synchronization {
	public static void main(String[] args) throws InterruptedException {
		SharedResource obj = new SharedResource();

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

		System.out.println("Final Count: " + obj.count); // Expected: 2000, but may be less due to race condition
	}
}
