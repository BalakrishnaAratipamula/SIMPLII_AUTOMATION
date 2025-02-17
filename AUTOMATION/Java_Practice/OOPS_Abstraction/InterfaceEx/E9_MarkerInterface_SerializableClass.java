package InterfaceEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//concrete class
class SerializableClass implements Serializable {
	private String data = "Serializable XXX";

	// getter method
	public String getData() {
		return data;
	}
}

public class E9_MarkerInterface_SerializableClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		SerializableClass obj = new SerializableClass();

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Outpu.txt"))) {
			oos.writeObject(obj);
			System.out.println("****Check the created file under project folder****");
		} catch (Exception e) {
			System.out.println("Searialization failed:  " + e);

		}

	}
}
