package boytoy;

public class Params {

	public static void main(String[] args) {
		printInfo("Jax", 26);
		printInfo("Bale", 28);
		printInfo("Mona", 25);
		
		polarBear("white", 20);
		
		System.out.println(add(5,6));
		polarBear("Brown", 65);
	}
	
	public static void printInfo(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}
	
	public static void polarBear(String furType, int teethCount) {
		System.out.println("You're a polar bear with " + furType +
				" fur and " + teethCount + " teeth!");
	}
	
	public static int add(int a, int b) {
		return a + b;
		
	}
	public static String caps(String s) {
		return s.toUpperCase();
	}
}
