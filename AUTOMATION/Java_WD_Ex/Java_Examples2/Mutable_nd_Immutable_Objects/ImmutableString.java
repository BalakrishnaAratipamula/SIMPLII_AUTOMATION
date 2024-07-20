package Mutable_nd_Immutable_Objects;

//Immutable Object: Can't change once it is created
public class ImmutableString {
	public static void main(String args[]) {

		String str = "Some text";
		str.concat("Another Text");

		System.out.println(str);

	}
}
