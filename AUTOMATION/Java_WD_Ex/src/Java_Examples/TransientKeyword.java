package Java_Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyword implements Serializable {
	// Normal variables
	int i = 10, j = 20;

	// Transient variables
	transient int t1 = 30, t2 = 20; // (or) transient int t1 = 30;

	// Use of transient but no impact here
	transient static int l = 40;
	transient final int m = 50;

	public static void main(String[] args) throws Exception {
		// serialization
		TransientKeyword input = new TransientKeyword();

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(input);

		// de-serialization
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		TransientKeyword obj = (TransientKeyword) ois.readObject();
		System.out.println("i = " + obj.i);
		System.out.println("j = " + obj.j);
		System.out.println("t1 = " + obj.t1);
		System.out.println("t2 = " + obj.t2);
		System.out.println("l = " + obj.l);
		System.out.println("m = " + obj.m);

	}
}
