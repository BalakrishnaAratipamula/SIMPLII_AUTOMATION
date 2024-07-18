package Thread;

public class DeadLock {
	/*
	 * Deadlock is the situation when a first thread is waiting for an object lock,
	 * that is acquired by a second thread and the second thread is waiting for an
	 * object lock that is acquired by the first thread. Since both threads are
	 * waiting for each other to release the lock. This condition is called
	 * deadlock.
	 */

	public static void main(String[] args) {
		Object resource1 = new Object();
		Object resource2 = new Object();

		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");	//print
					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}
					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");	//print
					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}

					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();

	}
}
