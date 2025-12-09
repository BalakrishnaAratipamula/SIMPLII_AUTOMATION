package Thread;

class MyThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+ " - Count: "+i); //.getName() - Returns this thread's name
			try {
				Thread.sleep(500); // pause for 0.5 seconds
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();

		t1.setName("Thread-A"); //.setName() - Changes the name of this thread to be equal to the argument name.
		t2.setName("Thread-B");

		t1.start(); // starts first thread
		t2.start(); // starts second thread
	}
}
