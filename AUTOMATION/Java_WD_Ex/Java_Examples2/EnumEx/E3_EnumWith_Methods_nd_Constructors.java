package EnumEx;

enum Size {
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRALARGE("XL");

	private String abbreviation;

	// Constructor
	Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	// Method
	public String getAbbreviation() {
		return abbreviation;
	}
}

public class E3_EnumWith_Methods_nd_Constructors {
	public static void main(String[] args) {
		Size size = Size.LARGE;
		System.out.println("Size: " + size);
		System.out.println("Abbreviation: " + size.getAbbreviation());
	}
}
