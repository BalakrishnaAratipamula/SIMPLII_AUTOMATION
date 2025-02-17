package Interface_MarkerInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializableClass implements Serializable {
	String data = "serializable_serializable_serializable_serializable_serializable_serializable";
	
	public String getData() {
		return data;
	}
}

public class MerkerInterface_SerializableClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SerializableClass obj = new SerializableClass();
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"))){
			oos.writeObject(obj);
			System.out.println("*****Check the downloaded file in project folder*****");
		}catch(Exception e) {
			System.out.println("searialization failed: "+e);
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
}
