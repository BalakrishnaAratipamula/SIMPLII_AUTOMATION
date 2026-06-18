package Interface;

@FunctionalInterface
interface Message {
    void show(String msg);
}

public class Z1E1_FunctionalInterface_LambdaExp2 {
	public static void main(String[] args) {

        Message m = (msg) -> System.out.println("Message: " + msg);

        m.show("Hello Lambda");
    }
}
