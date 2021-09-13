package Week6;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by laura on 19/02/2021
 * Practical – Algorithmic Analysis
 */
public class Qu1AlgorithmicAnalysis {

   public static int[] getArray(int[] array){

      for(int i = 0; i < 100; i++){
         Random rand = new Random();
         int n = rand.nextInt(100) + 1;
         array[i] = n;
      }
      return array;
   }

   public static int getMax(int[] array) {

      int max = array[0];

      for(int i = 0; i < array.length; i++){
         if (array[i] > max){
            max = array[i];
         }
      }
      return max;
   }

   public static int getMin(int[] array) {

      int min = array[0];

      for(int i = 0; i < array.length; i++){
         if (array[i] < min){
            min = array[i];
         }
      }
      return min;
   }

      public static int[] sortArray( int[] numbers){

         int in, out, temp;

         for (out = 1; out < numbers.length; out++) {
            temp = numbers[out];
            for (in = out; in > 0 && numbers[in - 1] >= temp; in--) {
               numbers[in] = numbers[in - 1];
            }
            numbers[in] = temp;
         }
         return numbers;
      }

      public static int getRange(int max, int min){

      return max - min;

   }

   public static int duplicates(int[] array){

      int count = 0;

      for(int i = 0; i < array.length -1; i++){
         //for(int j = 1; j < array.length; j++){
            //if(array[i] == array[j]){
         if  (array[i + 1] - array[i] == 0){
               count++;
         }
        // }
      }
      return count;
   }


   public static void main(String[] args) {

      // initialise Array

      int[] array = new int [100];

      //RANDOM ARRAY

      long startTimeRandom = System.currentTimeMillis();

      // max and min of random Array
      int[] randArray = getArray(array);
      int maxRand = getMax(randArray);
      int minRand = getMin(randArray);

      System.out.println("This is the random Array " + Arrays.toString(randArray));

      System.out.println("Finding max of the unsorted array is " + maxRand);

      System.out.println("Finding min of the unsorted array is " + minRand);

      long endTimeRandom = System.currentTimeMillis();

      //computing millisecond speed

      System.out.println(endTimeRandom - startTimeRandom + " milliseconds");


      //get duplicate count
      System.out.println("Duplicates = " + duplicates(randArray));

      //SORTED ARRAY

      long startTimeSorted = System.currentTimeMillis();

      //max and min of sorted Array
      int[] sortedArray = sortArray(randArray);
      int maxSort = getMax(sortedArray);
      int minSort = getMin(sortedArray);

      System.out.println("This is the sorted Array " + Arrays.toString(sortArray(randArray)));

      System.out.println("Finding max of the sorted array " + maxSort);

      System.out.println("Finding min of the sorted array " + minSort);

      long endTimeSorted = System.currentTimeMillis();

      //computing millisecond speed

      System.out.println(endTimeSorted - startTimeSorted + " milliseconds");

      //finding range

      System.out.println("The range of the max and min is: " + getRange(maxRand, minRand));

      //unsorted list ntimes sorted - slower
      //order 1 time in sorted list - faster

   }//main
}//class 
