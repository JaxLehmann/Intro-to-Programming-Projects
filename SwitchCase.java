
public class SwitchCase {

	public static void main(String[] args) {
		
		int day = 3;
		
		switch(day) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
			System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Not a valid day number"); }
				
				// String example
				
		String dog = "Chihuahua";
			switch (dog) {
				case "Black Lab":
					System.out.println("Medium-Sized dog.");
					break;
				case "Golden Retriever":
					System.out.println("Large-Sized dog.");
					break;
				case "Chihuahua":
					System.out.println("Tiny-Sized dog.");
					break;
				default:
					System.out.println("Name a listed dog.");
			}
		}
	}
