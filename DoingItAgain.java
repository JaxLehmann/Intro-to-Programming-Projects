package defaul;

public class DoingItAgain {
	public static void main(String []args) {
		String growl = PolarBearRoar();
		System.out.println(growl); 
		
		
		
		String shouting = caps("snarf snarf");
		System.out.println(shouting);
	}
 
	public static String PolarBearRoar() {
		return "ROOAR!";
	}
	public static String caps(String caps) {
		return caps.toUpperCase();
		
	}
}
