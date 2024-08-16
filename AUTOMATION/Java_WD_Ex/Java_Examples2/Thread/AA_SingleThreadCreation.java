package Thread;

public class AA_SingleThreadCreation {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.setName("My main Thread");
		t.setPriority(7);
		
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}
}
