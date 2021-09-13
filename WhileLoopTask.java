package Week1.Practical1;

/**
 * Created by laura on 18/01/2021
 * COMMENTS ABOUT PROGRAM HERE
 */

import java.util.Scanner;

public class WhileLoopTask {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);
      System.out.println("Enter the room temperature: ");
      int temperature = 0;
      temperature = kb.nextInt();

      while (temperature < 25){
         System.out.println("The heating is still on");
         System.out.println("Enter the room temperature: ");
         temperature = kb.nextInt();
      }
      System.out.println("The heating is off");

   }//main
}//class
