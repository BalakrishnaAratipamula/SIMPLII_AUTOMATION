package MethodReference_vs_Lambda;

import java.util.Arrays;

public class MethodReference_to_a_StaticMethod {

	// Using a lambda
	public static void main(String[] args) {
        Arrays.asList("a", "bb", "ccc")
              .forEach(s -> System.out.println(s));
    } //*/
	
	
	/*/Using a method reference
	public static void main(String[] args) {
        Arrays.asList("a", "bb", "ccc")
              .forEach(System.out::println);
    } //*/
}
