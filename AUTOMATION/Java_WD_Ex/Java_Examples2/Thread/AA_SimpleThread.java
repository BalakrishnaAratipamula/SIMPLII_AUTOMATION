package Thread;

public class AA_SimpleThread extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String args[]) {
		new AA_SimpleThread().start();
	}
}
