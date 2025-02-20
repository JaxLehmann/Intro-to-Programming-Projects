import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate = LocalDate.of(1998, 3, 31);
		int years = Period.between(birthdate, today).getYears();
		System.out.println(years);
		
		System.out.println(today);
		System.out.println(birthdate);
		

	}

}
