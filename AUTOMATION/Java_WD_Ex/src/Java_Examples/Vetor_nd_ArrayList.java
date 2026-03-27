package Java_Examples;

import java.util.ArrayList;
import java.util.Vector;

public class Vetor_nd_ArrayList {
	public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");

        Vector<String> vector = new Vector<>();
        vector.add("X");
        vector.add("Y");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
	}
}
