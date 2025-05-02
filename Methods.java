
public class Methods {
	public static void main (String[] args) {
		welcome(); 
		multiply(100, 200);
		multiply(3, 1);
		multiply(525, 21);
		divide(22, 21);
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	public static void welcome() {
		System.out.println("Welcome to our calculator!");
	}
	
	public static void divide(double a, double b) {
		System.out.println(a / b);
	}
}
