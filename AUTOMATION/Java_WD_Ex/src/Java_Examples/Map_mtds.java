package Java_Examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_mtds {
	/*/
	public static void main(String[] args) {
	Map<Integer, String> m1 = new HashMap<>();

	Map<Integer, String> m2 = new HashMap<Integer, String>();

	// put
	m1.put(1,"Welcome");m2.put(new Integer(2),"Simplilearn");m2.put(new Integer(5),"W3Schools");

	System.out.println(m1);System.out.println(m2);

	// remove
	System.out.println("\nremove5:    "+m2.remove(5)); // remove(key) | remove(key, value)

	// get
	System.out.println("\nget2:   "+m2.get(2));
	
	System.out.println("\n"+m1);System.out.println(m2);

	// containsKey
	System.out.println("\n"+m2.containsKey(4)); // containsKey(4) | containsValue(4)
	} //*/ 

	
	// .Entry<datatype, datatype>, .entrySet(), .getKey(), .getValue(), .keySet()
	public static void main(String[] args) {

		Map<String, Integer> mp1 = new LinkedHashMap<>();

		mp1.put("One", 1);

		mp1.put("Two", 2);

		mp1.put("Three", 3);

		mp1.put("Four", 4);
		
		for (Map.Entry<String, Integer> m : mp1.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
		// keySet()
		System.out.println("\nThe Keys are: " + mp1.keySet());
	} //*/
}