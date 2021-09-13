package Week1;

import java.util.Scanner;

/**
 * Created by laura on 16/01/2021
 * Lecture Notes
 */
public class SwitchStatement {

   static Scanner kb = new Scanner(System.in);

   public static void main(String[] args) {

      System.out.print("Enter a letter (A - Z):");
      String input = kb.nextLine();
      char letter = Character.toUpperCase(input.charAt(0));

      switch (letter){

         case 'A':
            System.out.println("A is a Vowel");
            break;
         case 'E':
            System.out.println("E is a Vowel");
            break;
         case 'I':
            System.out.println("I is a Vowel");
            break;
         case 'O':
            System.out.println("O is a Vowel");
            break;
         case 'U':
            System.out.println("U is a Vowel");
            break;
         default:
            System.out.println(letter + " is a Consonant");

      }//switch
   }//main
}//class 
