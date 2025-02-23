
public class CapitalizeString {

	public static void main(String[] args) {
		String s = "happy birthday";
	//	System.out.println(s.substring(0, 5));
		String result = s.substring(0, 1).toUpperCase() + s.substring(1);
		System.out.println(result);
	}

}
