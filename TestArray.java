package Week1.Practical1;

/**
 * Created by laura on 17/01/2021
  * Question 5 Test Array
 */
public class TestArray {


   public static void fillArray(int[] list) {
      for (int i = 0; i < list.length; i++) {
         list[i] = i * 10;
      }
   }

   public static void printArray(int[] list) {
      for (int i = 0; i < list.length; i++) {
         System.out.println("List[" + i + "] = " + list[i]);
      }
   }

   public static double getAverage(int[] array) {

      double count = 0;

      for (int i = 0; i < array.length; i++) {
         count += array[i];
      }
       return count / array.length;
   }


   public static void main(String[] args) {

      int[] list = new int[20];

      fillArray(list);
      printArray(list);
      System.out.print("\nThe average of values contained in array : " + getAverage(list));

   }//main
}//class 
