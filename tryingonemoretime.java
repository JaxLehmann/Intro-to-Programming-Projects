package defaul;

public class tryingonemoretime {
	public static void main (String [] args) {
		int c = subtract(13, 6);
		System.out.println(c);
	}
	
	public static int subtract (int a, int b) {
		return a - b;
	}

}

/* Explaining this to yourself.
 we have a main method in which the code gets ran. Anything outside
 of that method is not ran.

We made a new method, AN INTEGER method CALLED SUBTRACT.
It takes two integers, and returns the outcome of them

In the main method, we have the result of a - b, stored in an Int named c
*/