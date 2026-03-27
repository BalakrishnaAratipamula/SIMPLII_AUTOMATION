package Thread;

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println("Thread finished.");
    }
}


public class Join_mtd2 {
	public static void main(String[] args) throws InterruptedException {
        MyThread3 t1 = new MyThread3();
        t1.start();

        t1.join(); // Main thread waits for t1 to finish

        System.out.println("Main thread resumes after t1 completion.");
    }
}
