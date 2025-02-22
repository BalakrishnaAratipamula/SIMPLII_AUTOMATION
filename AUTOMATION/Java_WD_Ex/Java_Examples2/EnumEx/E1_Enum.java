package EnumEx;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class E1_Enum {
	public static void main(String[] args) {
		Day today = Day.SATURDAY;

		System.out.println("Today is: " + today);

		// Loop through all enum values
		for (Day d : Day.values()) {
			System.out.println(d);
		}
	}
}
