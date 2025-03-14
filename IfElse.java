package ifElseStatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade.");
		int grade = scan.nextInt();
		
		if (grade >= 90 && grade <= 100) {
			System.out.println("A");
		} else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("C");
		} else if (grade >= 60 && grade < 70) {
			System.out.println("D");
		} else if (grade < 60) {
			System.out.println("F");
		} else {
			System.out.println("DNE!");
		}
	}}
