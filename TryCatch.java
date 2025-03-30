import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		
		try {
			int n = scan.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("Please enter a number.");
		} */

		
		try {
			int[] a = null;
			System.out.println(a);
		} catch(NullPointerException e) {
			System.out.println("Your array is null!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds!");
		} catch(Exception e) {
			System.out.println("Invalid");
		}

	}

}
