package Week1;

/**
 * Created by laura on 16/01/2021
 * Lecture Tasks
 */
public class Numbers1 {

   public static int sumRange(int s, int e) {

      int n;
      if (s > e) {
         n = (s - e) + 1;
      } else {
         n = (e - s) + 1;
      }

      return (n * (s + e)) / 2;
   }

      public static void main(String[] args) {

         int sum = sumRange(1,10);
         System.out.println("Answer is " + sum);

   }//main
}//class 
