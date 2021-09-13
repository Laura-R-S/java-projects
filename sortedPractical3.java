package Week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by laura on 28/01/2021
 * Sorting Algorithms
 */

public class sortedPractical3 {

   public static void bubbleSort(int[] numbers) {

      int swap = 0;
      int comp = 0;
      boolean swapped = true;

      for (int out = numbers.length - 1; out > 0; out--) {
         swapped = false;
         for (int in = 0; in < out; in++) {
            comp++;
            if (numbers[in] > numbers[in + 1]) {
               swapped = true;
               System.out.println(Arrays.toString(numbers));
               int tmp = numbers[in];      // swap items
               numbers[in] = numbers[in + 1];
               numbers[in + 1] = tmp;
               swap++;
            }//if
         }//for
         for (int i = 0; i < numbers.length; i++) {
            //System.out.print(numbers[i] + "");
            //System.out.println();
            if (!swapped) {
               out = 0;
            }
         }
      }
   }


   public static int[] readNumbers(String fileName) {

      int[] array = new int[10];

      try {
         FileReader fr = new FileReader(fileName);
         BufferedReader br = new BufferedReader(fr);
         String c = br.readLine();

         //int num;
         int size = -1;

         while (c != null) {
            int num = Integer.parseInt(c);
            size++;
            array[size] = num;
            c = br.readLine();
         }
         //System.out.println(Arrays.toString(array));
         br.close();
         fr.close();
      } catch (
            IOException e) {
         System.out.println("Error Opening File");
      }//catch
      return array;
   }//method

   public static void selectionSort(int[] numbers) {

      int pos1, pos2, min;
      int swap = 0;
      int comp = 0;
      int minChanged = 0;
      for (pos1 = 0; pos1 < numbers.length - 1; pos1++) {
         min = pos1; //1
         for (pos2 = pos1 + 1; pos2 < numbers.length; pos2++) {
            //System.out.println(Arrays.toString(numbers));
            if (numbers[pos2] < numbers[min]) {
              //System.out.println(Arrays.toString(numbers));
               min = pos2;   // new minimum
               swap++;
            }
            comp++;
         }
         int tmp = numbers[pos1];
         numbers[pos1] = numbers[min];
         numbers[min] = tmp;
         minChanged++;
      }

      System.out.println("swap " + swap);
      System.out.println("comp " + comp);
      System.out.println("min changed " + minChanged);
      System.out.println("Selection Sort " + Arrays.toString(numbers));
   }

   public static int[] generateRandom(int qty){

//      if ((qty <= 0) || (qty > 100)){
//         throw new IllegalArgumentException("Quantity must be between 1-100");
//      }

      int[] randomArray = new int[qty];
      int min = 1;
      int max = 100;

      //Random rand = new Random();

      for(int i = 0; i < qty; i++){
         //int rand1 = rand.nextInt(qty);
         randomArray[i] = (int)(Math.random() * (max - min +1) + min);
      }
      return randomArray;
   }


   public static void insertionSort(int[] numbers) {

      int in, out, temp;
      for (out = 1; out < numbers.length; out++) {
         //System.out.println(Arrays.toString(numbers));
         temp = numbers[out];
         for (in = out; in > 0 && numbers[in - 1] >= temp; in--) {
            System.out.println(Arrays.toString(numbers));
            numbers[in] = numbers[in - 1];
         }
         numbers[in] = temp;
      }
      System.out.println("Insertion Sort " + Arrays.toString(numbers));
   }


   public static void main(String[] args) {

      int[] numbers = {26,15,36,12,68,7};

      // Create array copies for sorting
      int[] a = numbers.clone();

      int[] b = numbers.clone();

//      String file1 = "file1.txt";
//      String file2 = "file2.txt";
//      String file3 = "file3.txt";
//
//      int[] array = readNumbers(file1);
//      bubbleSort(array);
//      int[] array1 = readNumbers(file2);
//      bubbleSort(array1);
//      int[] array2 = readNumbers(file3);
//      bubbleSort(array2);
//
//      selectionSort(a);


      int[] array = { 32,  53,  19,  15,  42,  68,  16 };
      insertionSort(array);
//
//      int[] randArray = generateRandom(101);
//
//      int[] randArray1 = randArray.clone();
//      int[] randArray2 = randArray.clone();

      //bubbleSort(numbers);
//      selectionSort(randArray1);
//      insertionSort(randArray2);

   }//main
}//class 
