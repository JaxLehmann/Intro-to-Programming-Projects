package defaul;

public class ReturnStatements {
	public static void main (String[] args) {
		// return statements happen inside METHODS
		// we can CALL our printAMessage METHOD to run the code!
		printAMessage();
		int sum = add(5, 5);
		// Can't store a variable with that! so we can't do something like
		// int sum = add(5, 4); .. it just won't work! TIME FOR RETURN STATEMENTS!
		// void is the type that the method will return. VOID MEANS NOTHING
		System.out.println(sum);
		
		String shouting = caps("why are you shouting?");
		System.out.println(shouting);
		int[] awesomeArray = gimmeArrayFromInts(3, 7, 1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}
	
	public static void printAMessage() {
		System.out.println("This is our first method.");
		// only stuff in the main method gets ran!
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String caps(String s) {
		return s.toUpperCase();
	}
	
	public static int[] gimmeArrayFromInts(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}

}
