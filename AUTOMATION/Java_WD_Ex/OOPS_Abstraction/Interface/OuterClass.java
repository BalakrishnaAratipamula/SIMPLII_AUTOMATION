package Interface;

abstract class AnonymousClassEx {	//https://youtu.be/NQLZhkdVN4Q?si=Ybj1oZo7HET85aBk
	public abstract void display();
}

public class OuterClass {
	public static void main(String[] args) {
		AnonymousClassEx innerClass = new AnonymousClassEx() {
			@Override
			public void display() {
				System.out.println("Anonymous inner class example");
			}
		
		};
		innerClass.display();
		
	}
}
