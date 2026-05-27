package PairClass;

import java.util.AbstractMap;
import java.util.Map;

public class AlternativeWayOfUsing_PairClassMethods2 {
	public static void main(String[] args) {

        Map.Entry<Integer, String> pair =
                new AbstractMap.SimpleEntry<>(1, "Java");

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
