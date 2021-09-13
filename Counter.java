package Week1;


import java.util.Scanner;

/**
 * Created by laura on 16/01/2021
 * Do While Loop
 */
public class Counter {

   static Scanner kb = new Scanner(System.in);

   public static void totalNumbersWHILE() {

      int total = 0;
      int num;

      do {

         System.out.println("Enter number (0 to quit): ");
         num = kb.nextInt();
         total += num;
      }
      while (num > 0);

      System.out.println("Total is: " + total);
   }

   public static void main(String[] args) {

      totalNumbersWHILE();

   }//main
}//class