package Thread;

class MyThread7 extends Thread {
    public void run() {
        System.out.println("Child thread is running");
    }
}

public class Join_mtd3 {
	public static void main(String[] args) throws InterruptedException {
        MyThread7 t = new MyThread7();
        t.start();

        t.join(); // Main thread waits for t to finish

        System.out.println("Main thread continues");
    }
}
