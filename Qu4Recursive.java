package Week5;

import java.util.Scanner;

/**
 * Created by laura on 15/02/2021
 * Qu4 Recursive
 */
public class Qu4Recursive {

   public static int a(int number) {

      int answer;

      if (number == 1) {
         answer = 3;
         System.out.println(answer);
      }//if
      else {
         answer = a(number - 1) + 2;
         System.out.println(answer);
      }//else
      return answer;
   }


public static void main(String[] args) {

   Scanner keyboard = new Scanner(System.in);

   int number;

//   System.out.print("How many odd numbers do you want the sequence for: ");
//   number = keyboard.nextInt();
   a(3);

   }//main
}//class 
