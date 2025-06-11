import java.lang.Math;
import java.util.Scanner;

public class Homework5 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      while (true){
         System.out.println("Enter a floating number to be rounded higher or lower");
         String input = scan.nextLine();
         
         if (input.equalsIgnoreCase("quit")) {
         System.out.println("Thank you, have a nice day!");
         break;
         }
         try {
         double number = Double.parseDouble(input);
         
            System.out.println("Your floating number rounded up is " + (int)Math.ceil(number));
            System.out.println("Your floating number rounded down is " + (int)Math.floor(number));
            }
         catch (Exception e){
         }
         
         
      
      }
      
   }

}