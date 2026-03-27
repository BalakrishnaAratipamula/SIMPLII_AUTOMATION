package Thread;

class MyThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            Thread.yield(); // Hint to scheduler
        }
    }
}

public class yield_mtd {
	public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();
        t1.start();
        t2.start();
    }
}
