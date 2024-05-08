package Java_Examples;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		LocalDate localdate = LocalDate.now();
		LocalDate birthdate = LocalDate.parse("1992-10-30");
		Period age = Period.between(localdate, birthdate);
		System.out.println(age);
	}
}
