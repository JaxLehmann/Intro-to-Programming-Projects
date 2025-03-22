
public class NestedForLoops {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("It's so freaking cold outside");
		}
		
		System.out.println("------------");
		
		String[] colors = {"red", "blue", "green"};
		
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		System.out.println("------------");
		

		String[] [] fancyColors = { {"red", "blue", "green"},
									{"cyan", "magenta", "turqoise"}
		};
		
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(fancyColors[i][j]);
			}}
			
			System.out.println("-------------");
			
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i: " + i + ", j: " + j);
			}
		}
	}
}
