package Week4;

import java.text.DecimalFormat;

/**
 * Created by laura on 07/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CreatingArrays {
   public static void main(String[] args) {

      DecimalFormat df = new DecimalFormat(".00");

      int[][] intArray = new int[5][2];
      double[][] doubleArray = new double[10][15];
      String[][] stringArray = new String[3][10];


      for(int r = 0; r < intArray.length; r++){
         for(int c = 0; c < intArray[0].length; c++){
            intArray[r][c] = (int) (Math.random() * (30 - 1 + 1) + 1);
            System.out.print(intArray[r][c] + "\t");
         }
         System.out.println();
      }

      for(int r = 0; r < doubleArray.length; r++){
         for(int c = 0; c < doubleArray[0].length; c++){
            doubleArray[r][c] = (Math.random() * (30 - 1 + 1) + 1);
            System.out.print(doubleArray[r][c] + "\t");
         }
         System.out.println();
      }

      for(int r = 0; r < stringArray.length; r++){
         for(int c = 0; c < stringArray[0].length; c++){
            stringArray[r][c] = "Hello";
            System.out.print(stringArray[r][c] + " ");
         }
         System.out.println();
      }

   }//main
}//class 
