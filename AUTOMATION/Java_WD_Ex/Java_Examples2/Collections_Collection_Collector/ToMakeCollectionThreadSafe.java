package Collections_Collection_Collector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// To make collection is Thread-safe we can use synchronizedList(), synchronizedSet(), synchronizedMap()
public class ToMakeCollectionThreadSafe { 
	public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Make it thread-safe
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Adding elements
        synchronizedList.add("A");
        synchronizedList.add("B");
        synchronizedList.add("C");

        // Iteration must be done inside synchronized block
        synchronized (synchronizedList) {
            for (String s : synchronizedList) {
                System.out.println(s);
            }
        }
    }
}
