package EnumEx;

public class E2_Enum {
	public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SUNDAY:
                System.out.println("Rest day!");
                break;
            default:
                System.out.println("Just another day.");
                break;
        }
    }
}
