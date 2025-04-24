package defaul;

public class Arrayboyz {
	public static void main (String[]args) {
		
		int [] awesomeArray = gimmeBigArray(16, 18, 20);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}
	
	public static int[] gimmeBigArray(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}

}
