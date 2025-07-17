package Thread;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class join_mtd {
	public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t1.join(); // main thread waits until t1 finishes

        t2.start();
        t2.join(); // main thread waits until t2 finishes

        t3.start();
        // main thread will continue immediately after t3.start()
        // but if you want to wait, you can call t3.join();
    }
}
