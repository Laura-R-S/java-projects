package ClassTest2;

import java.util.Scanner;

/**
 * Created by laura on 09/11/2020
 * Reverse Names Test
 */
public class ReverseNames {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);

      String[] names = new String[5];

      //loop to get user input for names
      for(int i = 0; i < 5; i++){
         System.out.print("Please enter name " + (i+1) + ":");
         names[i] = kb.nextLine();
      }

      System.out.println("Names entered are:");
      // for loop to output names with spaces
      for(int i = 0; i < names.length; i++) {
         System.out.print(names[i] + " ");
      }
      System.out.println();
      System.out.println("Names reversed are:");
      //loop to reverse names
      for(int i = names.length - 1; i >= 0; i--) {
         System.out.print(names[i] + " ");
      }

   }//main
}//class 
