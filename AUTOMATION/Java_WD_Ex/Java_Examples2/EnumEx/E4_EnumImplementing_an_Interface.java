package EnumEx;

interface Displayable {
	void display();
}

enum Status implements Displayable {
	SUCCESS, FAILURE, PENDING;

	@Override
	public void display() {
		System.out.println("Status: " + this);
	}
}

public class E4_EnumImplementing_an_Interface {
	public static void main(String[] args) {
		Status status = Status.SUCCESS;
		status.display();
	}
}
