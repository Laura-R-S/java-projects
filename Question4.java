package Week1.Practical1;

import java.util.Scanner;

/**
 * Created by laura on 17/01/2021
 * Question 4 a and b
 */
public class Question4 {

   static Scanner kb = new Scanner(System.in);

   public static int sumRange(int s, int e) {

      // Question 4 (a)
      int n;
      if (s > e) {
         n = s - e + 1;
      } else {
         n = e - s + 1;
      }

      return (n * (s + e)) / 2;
   }

   public static void main(String[] args) {

      // Question 4 (a)
      System.out.println(sumRange(1 , 10));

      // Question 4 (b)
      char exit;
      int start, end;

      do {
         System.out.println("Enter number at the start of the range: ");
         start = kb.nextInt();
         System.out.println("Enter number at the end of the range: ");
         end = kb.nextInt();


         int sum = sumRange(start, end);
         System.out.println("Answer is " + sum);


         System.out.println("Press Y to continue and N to exit. ");
         exit = kb.next().toUpperCase().charAt(0);


      } while (exit != 'N');


   }//main
}//class

