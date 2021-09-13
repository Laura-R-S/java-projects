package Week7;

import java.util.Arrays;

/**
 * Created by laura on 23/02/2021
 *Question 3
 */
public class Qu3SelectionSort {

   public static int[] selectionSort(int[] numbers) {

      int in, out, min;

      for (out = 0; out < numbers.length - 1; out++) {
         min = out; //1
         for (in = out + 1; in < numbers.length; in++) {
            //System.out.println(Arrays.toString(numbers));
            if (numbers[in] < numbers[min]) {
               //System.out.println(Arrays.toString(numbers));
               min = in;   // new minimum
               //swap++;
            }
            //comp++;
         }
         int tmp = numbers[out];
         numbers[out] = numbers[min];
         numbers[min] = tmp;
         for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
         System.out.println();

      }

      return numbers;
   }



   public static void main(String[] args) {

      int[] array = {3,6,8,5,4};

      selectionSort(array);
     int[] sorted = selectionSort(array);
      System.out.println(sorted);


   }//main
}//class 
