package MethodReference;

interface Messageable {
	Message getMessage(String msg);
}

class Message {	//class
	Message(String msg) {	//Constructor
		System.out.print(msg);
	}
}

public class Reference_to_Constructor {
	public static void main(String[] args) {
		Messageable obj = Message::new;
		obj.getMessage("Hello");
	}
}
