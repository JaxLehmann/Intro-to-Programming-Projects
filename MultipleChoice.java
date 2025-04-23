import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] responses = {"", "", "", ""};
		String[] answers = {"b", "a", "d", "a"};
		
		System.out.println("What is 2+2?");
		System.out.println("a) 2");
		System.out.println("b) 4");
		System.out.println("c) 6");
		System.out.println("d) 8");
		responses[0] = scan.nextLine();
		
		System.out.println("Who is my favorite cat");
		System.out.println("a) Loki");
		System.out.println("b) Koda");
		System.out.println("c) Trone");
		System.out.println("d) Chocolate");
		responses[1] = scan.nextLine();
		
		System.out.println("Who is our president?");
		System.out.println("a) Mona");
		System.out.println("b) Bernie");
		System.out.println("c) Obama");
		System.out.println("d) Trump");
		responses[2] = scan.nextLine();
		
		System.out.println("What is Jax's favorite show?");
		System.out.println("a) Arcane");
		System.out.println("b) Breaking Bad");
		System.out.println("c) Family Guy");
		System.out.println("d) Seinfield");
		responses[3] = scan.nextLine();

		
		int score = 0;
		for (int i = 0; i < 4; i++) {
			if(responses[i].equalsIgnoreCase(answers[i])) {
				score++;
			}
		}
		System.out.println("Score: " + score + " out of 4");
		scan.close();
	}
}
