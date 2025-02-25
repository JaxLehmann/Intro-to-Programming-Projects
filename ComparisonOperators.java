
public class ComparisonOperators {

	public static void main(String[] args) {
		
		// == is equal to
		// <= less than or equal to
		// < less than
		// <= greater than or equal to
		// > greater than
		// != not equal to
		// || is or
		
		
		double a = 2.4;
		double b = 4.0;
		
		boolean c = (a != b);
		
		System.out.println(c);
		
		if (a == 2.4) {
			System.out.println("They are equal");
		}
		
		if (a < 7) {
			System.out.println("Less than 7");
		}
		
		if (a == 2.4 || a == 2.5) {
			System.out.println("a is " + a + " or your mama!");
		}
		
		if (a > 0 && a < 100) {
			System.out.println("Alex Lee is mah daddy!");
		}

	}

}
