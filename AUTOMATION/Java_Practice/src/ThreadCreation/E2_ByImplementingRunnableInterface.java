package ThreadCreation;

public class E2_ByImplementingRunnableInterface implements Runnable{
	public void run() {
		System.out.println("Thread is under running....");
		for(int i=1; i<=5; i++) {
			System.out.println("i= "+i);
		}
	}
	
	public static void main(String[] args) {
		E1_ByExtendingThreadClass iri = new E1_ByExtendingThreadClass();
		Thread thread = new Thread(iri);
		
		System.out.println("Thread about to start....");
		
		thread.start();
	}
}
