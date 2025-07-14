package Java_Examples;

class VolatileExample2 extends Thread{
	private volatile boolean running = true;
	
	public void run() {
		while(running) {
			System.out.println("Running");
		}
	}
	
	public void stopRunning() {
		running = false;
	}
}

public class VolatileEx2 {
	public static void main(String[] args) throws InterruptedException{
		VolatileExample2 ex = new VolatileExample2();
		ex.start();
		//sleep for 1 sec
		Thread.sleep(1000);
		ex.stopRunning(); //after 1 sec 'stopRunning' no more output, thread stop
	}
}
