package Synchronizatio_In_Java;

//example of java synchronized method  
class Table2 {
	synchronized void printTable(int n) {// synchronized method
		System.out.println("Table with using Synchronized method");
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1b extends Thread {
	Table2 t;

	MyThread1b(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2b extends Thread {
	Table2 t;

	MyThread2b(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class E5Ex_with_SynchronizedMethod {
	public static void main(String args[]) {
		Table2 obj = new Table2();// only one object
		MyThread1b t1 = new MyThread1b(obj);
		MyThread2b t2 = new MyThread2b(obj);
		t1.start();
		t2.start();
	}
}
