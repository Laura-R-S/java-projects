package Week1;

/**
 * Created by laura on 16/01/2021
 * TASK - Arrays and For loops
 */
public class ArraysForLoops {
   public static void main(String[] args) {

//      char[] letters = new char[10];
      double[] decimals = {3.3, 9.0, 45.0, 6.5, 7.9};

//      // Print out the values in the array
//      int length = decimals.length;
//
//      for (int i = 0; i < length; i++) {
//
//         System.out.println(decimals[i]);
//      }

      //Modify the code multiply the values in the array by 2

//      for (int i = 0; i < length; i++) {
//         decimals[i] *= 2;
//         System.out.println(decimals[i]);
//      }

      // Modify the following code so that the order of the output numbers will be reversed.
      int length1 = decimals.length - 1;

      for (int i = length1; i >= 0; i--) {
         decimals[i] *= 2;
         System.out.println(decimals[i]);
      }
   }//main
}//class 
