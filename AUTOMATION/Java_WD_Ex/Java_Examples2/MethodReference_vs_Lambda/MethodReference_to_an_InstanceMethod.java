package MethodReference_vs_Lambda;

import java.util.Arrays;

public class MethodReference_to_an_InstanceMethod {
	
	/*/ Using a lambda
	public static void main(String[] args) {
        String prefix = "Hello ";

//        Arrays.asList("Alice", "Bob")
//              .forEach(name -> prefix.concat(name));
              
              Arrays.asList("Alice", "Bob")
      		  .forEach(name -> System.out.println(prefix + name));
      
    } //*/
	
	
	//Using a method reference
	public static void main(String[] args) {
        String prefix = "Hello ";

//        Arrays.asList("Alice", "Bob")
//              .forEach(prefix::concat);
        
        Arrays.asList("Alice", "Bob")
        	  .stream()
              .map(prefix::concat)   // method reference
              .forEach(System.out::println); // method reference
    } //*/
}
