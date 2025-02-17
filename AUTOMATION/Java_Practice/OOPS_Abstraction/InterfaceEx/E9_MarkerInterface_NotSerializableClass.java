package InterfaceEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//concrete class
class NotSerializableClass{
	private String data = "NotSerializable";
	
	//getter method
	public String getData() {
		return data;
	}
}

public class E9_MarkerInterface_NotSerializableClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		NotSerializableClass obj = new NotSerializableClass();
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Outpu.txt"))){
			oos.writeObject(obj);
			System.out.println("****Check the created file under project folder****");
		} catch(Exception e) {
			System.out.println("Searialization failed:  "+e);
			
		}
		
	}
}
