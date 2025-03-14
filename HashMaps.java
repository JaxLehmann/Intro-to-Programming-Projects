import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("bobbyJoe1996", "FluffyPonies!");
		fun.put("lyejax", "CrispyChristmas!");
		fun.put("coolguyswag", "Password123!");
		
		
		System.out.println(fun.containsValue("Password123!"));
		
	}

}
