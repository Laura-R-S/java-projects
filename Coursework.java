package Coursework;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by laura on 07/01/2021
 * Coursework for class COM742 22/01/2021
 */

public class Coursework {

   static DecimalFormat df = new DecimalFormat(".000");
   static Scanner kb = new Scanner(System.in);

   public static int countNegativeValues(int[] array) {
        /*
        Description: Counts the negative integer values in an array
        Parameters:  int array to be counted
        Returns: int number of negative values
        */

      int count = 0;

      for (int i = 0; i < array.length; i++) {
         if (array[i] < 0) {
            count++;
         }//if
      }//for

      return count;

   }

   public static double medianArrayValue(int[] array) {
        /*
        Description: Computes median value from a sorted array
        Parameters:  int array of values from which median is computed
        Returns: double calculated median value
        Note: Array must be sorted
        */

      double median;
      if (array.length % 2 == 0) {
         median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
      }else {
         median = array[array.length / 2];
      }
         return median;
   }

   public static int modeArrayValue(int[] array) {
        /*
        Description: Computes the first mode value from a sorted array
        Parameters:  int array of values from which mode is computed
        Returns: int first mode value
        Note: Array must be sorted
        */
      int length = array.length;
      int mode = 0;
      int maxCount = 0;


      for (int i = 0; i < length; i++) {
         int count = 0;
         for (int j = 0; j < length; j++) {
            if (array[j] == array[i]) {
               count++;
            }
            if (count > maxCount) {

               maxCount = count;
               mode = array[i];
            }
         }
      }
      return mode;
   }

   public static int minArrayValue(int[] array) {
        /*
        Description: Computes minimum value from an int array
        Parameters:  int array of values from which to find minimum
        Returns: int minimum value
        */
      int min = 0;

      for (int i = 0; i < array.length - 1; i++) {
         if (array[i] < min) {
            min = array[i];
         }
      }
      return min;

   }

   public static int maxArrayValue(int[] array) {
        /*
        Description: Computes maximum value from an int array
        Parameters:  int array of values from which to find maximum
        Returns: int maximum value
        */
      int max = 0;

      for (int i = 0; i < array.length; i++) {
         if (array[i] > max) {
            max = array[i];
         }
      }
      return max;
   }


   public static int binarySearch(int array[], int key) {
        /*
        Description: Performs binary search on an array for a specified value
        Parameters:  int array of values and int key which item to be searched
        Returns: int indicating first location of item, or -1 in case not found
        */
      int top = array.length - 1;
      int bottom = 0;
      int mid = (bottom + top) / 2;
      int comp = 0;
      int location = 0;
      boolean found = false;

      while ((bottom <= top) && (!(found))) {
         comp++;
         if (array[mid] == key) {
            found = true;
            location = mid;
         } else if (array[mid] < key) {
            bottom = mid + 1;
         } else {
            top = mid - 1;
         }
         mid = (bottom + top) / 2;
      }// while
      if (bottom > top) {
         return -1;
      }
      System.out.println("Binary Search: Comparisons = " + comp);
      return location;
   }


   private static int[] readArrayFromFile(String filename) {
      /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers
        */
      int[] array = new int[1];

      try {

         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);
         String c = br.readLine();
         Integer size = Integer.parseInt(c);
         array = new int[size];
         //System.out.println(array.length);

        for (int i = 0; i < size; i++) {
            c = br.readLine();
            array[i] = Integer.parseInt(c);
            //System.out.println(array[i]);
         }
         br.close();
         fr.close();
      } catch (IOException e) {
         System.out.println(e);
      }
      return array;
   }

   public static void swap(int[] array, int posA, int posB) {
        /*
        Description: Swaps two values in an int array
        Parameters:  int array of values and positions of elements to be swapped
        Returns: void
        */
      int tmp = array[posA];
      array[posA] = array[posB];
      array[posB] = tmp;
   }

   public static void bubbleSort(int[] array) {
        /*
        Description: Sorts a int array using bubblesort algoritm
        Parameters:  int array of values to be sorted
        Returns: void
        */
      int ncomps = 0, nswaps = 0; // declare and initialise counters
      for (int out = array.length - 1; out > 0; out--) {
         for (int in = 0; in < out; in++) {
            ncomps++; // increment number of comparisons
            if (array[in] > array[in + 1]) {
               nswaps++;  // increment number of swaps
               swap(array, in, in + 1);
            }
         }
      }
     // System.out.println("Bubble Sort: Comparisons=" + ncomps + ", Swaps=" + nswaps);
   }

   public static double meanArrayValue(int[] array) {
        /*
        Description: Computes mean value from an array
        Parameters:  int array of values from which mean is computed
        Returns: double calculated mean value
        */

      double count = 0;

      for (int i = 0; i < array.length; i++) {
         count += array[i];
      }
      return count / array.length;
   }

   public static double meanOddValue(int[] array, int start, int end) {

      /*
   Description: Compute the mean of the odd numbers between start and end from an array
   Parameters:  int array of values from which mean is computed, start value, end value
   Returns: double calculated mean value
   */

      double sum = 0;
      int count = 0;

      for(int i = 0; i < array.length; i++){
         if((array[i] % 2 != 0)){
            sum += array[i];
            count++;
         }
      }

      return sum / count;
   }


   public static int countNegativeOddValues(int[] array) {
        /*
        Description: Counts the negative odd integer values in an array
        Parameters:  int array to be counted
        Returns: int number of negative odd values
        */
      int count = 0;

      for (int i = 0; i < array.length; i++) {
         if ((array[i] < 0) && (array[i] % 2 != 0)) {
            count++;
         }
      }

      return count;

   }


   public static int countZeroValues(int[] array) {
        /*
        Description: Counts the zero integer values in an array
        Parameters:  int array to be counted
        Returns: int number of zero values
        */

      int count = 0;

      for (int i = 0; i < array.length; i++) {
         if (array[i] == 0) {
            count++;
         }
      }
      return count;
   }


   public static int countPositiveValues(int[] array, int threshold) {
        /*
       Description: Counts the Positive integer values in an array greater than a given value (e.g, count the number of values greater than 10000)
        Parameters:  int array to be counted, threshold value
        Returns: int number of values greater than threshold
       */

      int count = 0;

      for (int i = 0; i < array.length; i++) {
         if ((array[i] >= 0) && (array[i] > threshold)) {
            count++;
         }
      }
      return count;
   }


   public static int sumPositiveValues(int[] array, int threshold) {
        /*
        Description: Sums the positive integer values in an array above a given threshold (e.g, sum the number of values greater than 10000)
        Parameters:  int array to be counted
        Returns: int sum of positive values
        */

      int sum = 0;

      for (int i = 0; i < array.length; i++) {
         if ((array[i] >= 0) && (array[i] > threshold)) {
            sum += array[i];
         }
      }
      return sum;
   }


   public static void main(String[] args) {

      // Read array from file and print

      int[] numbers = readArrayFromFile("test.txt");

      //int negative = countNegativeValues(numbers);
//
      int start = -35000;
      int end = 20000;
      int threshold = 0;


      //bubbleSort(numbers);
//      System.out.println("Location of key = " + binarySearch(numbers, 84726));
//      System.out.println("Total Negatives in Array = " + negative);
//      System.out.println("Minimum value in Array = " + minArrayValue(numbers));
//      System.out.println("Maximum Value in Array = " + maxArrayValue(numbers));
//      System.out.println("Median value in Array = " + df.format(medianArrayValue(numbers)));
//      System.out.println("Mode value in Array = " + modeArrayValue(numbers));
//      System.out.println();
//      System.out.println("Mean of Array = " + df.format(meanArrayValue(numbers)));
      System.out.println("Mean odd values = " + df.format(meanOddValue(numbers, start, end)));
//      System.out.println("Count Negative Odd Numbers = " + countNegativeOddValues(numbers));
//      System.out.println("Number of Zeros = " + countZeroValues(numbers));
//      System.out.println("Count positive values = " + countPositiveValues(numbers, threshold));
//      System.out.println("Sum positive values = " + sumPositiveValues(numbers, threshold));

   }//main
}//class
