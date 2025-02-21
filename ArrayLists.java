import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		/* Recapping Arrays
		 * String[] fruits = new String[3];
		 * fruits[0] = "Mango";
		 * fruits[1] = "Apple";
		 * fruits[2] = "Peach";
		 * System.out.println("fruits[1]);
		 */
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Peach");
		fruitList.add("Apple");
		fruitList.add("Watermelon");
		// fruitList.clear();
		System.out.println(fruitList.contains("Apple"));
		System.out.println(fruitList);
		// can see all the elements by using arraylists!
		// with a regular array, we need to create a third index to add stuff / change
		// size parameters!
	}

}
