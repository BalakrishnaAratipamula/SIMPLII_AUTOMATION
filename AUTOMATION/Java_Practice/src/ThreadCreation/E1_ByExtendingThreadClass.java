package ThreadCreation;

public class E1_ByExtendingThreadClass extends Thread{
	public void run() {
		System.out.println("Thread is under running....");
		for(int i=1; i<=5; i++) {
			System.out.println("i= "+i);
		}
	}
	
	public static void main(String[] args) {
		E1_ByExtendingThreadClass t1 = new E1_ByExtendingThreadClass();
		System.out.println("Thread about to start....");
		
		t1.start();
	}
}
