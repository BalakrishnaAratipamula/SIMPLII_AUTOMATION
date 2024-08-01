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
	
	/*/
	public static void main(String[] args) {
		Map<String, Integer> mp1 = new LinkedHashMap<>();

		mp1.put("One", 1);
		mp1.put("Two", 2);
		mp1.put("Three", 3);
		mp1.put("Four", 4);
		
		for (Map.Entry<String, Integer> entry : mp1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		// keySet()
		System.out.println("\nThe Keys are: " + mp1.keySet());
	} //*/
	
	
	/*/
	public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("Bangalore", 560);
        map.put("Chennai", 890);
        map.put("Hyderabad", 566);
        map.put("Mumbai", 788);
        map.put("New Delhi", 1000);

        for(Map.Entry<String,Integer> entry:map.entrySet()) {
              System.out.println("Distance from Hometown to " + entry.getKey()+" is " + entry.getValue()+" Kms");
        } //*/
	
	public static void main(String[] args) { 
  
        // Creating an empty HashMap 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        hash_map.put(10, "Geeks"); 
        hash_map.put(15, "4"); 
        hash_map.put(20, "Geeks"); 
        hash_map.put(25, "Welcomes"); 
        hash_map.put(30, "You"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Using values() to get the set view of values 
        System.out.println("The collection is: " + hash_map.values()); 
    } 

}