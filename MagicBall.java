package magic8ball;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
	public static void main(String[]args) {
		
		System.out.println("Enter your question.");
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();
		
		int x = rand.nextInt(5) + 1;
		
		if (x == 1) {
			System.out.println("The future is dim.");
		} else if (x == 2) { 
			System.out.println("The future is good.");
		} else if (x == 3) {
			System.out.println("Only time will tell.");
		} else if (x == 4) {
			System.out.println("Big borris.");
		} else if (x == 5)
			System.out.println("KILL BIG BORRIS!");
		} }
