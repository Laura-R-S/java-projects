package Sandbox;

/**
 * Created by laura on 18/01/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ComputeRemainder {

   public static long computeRemainder(long base, long power, long divisor){

      long baseRaisedToPower = 1;

      for(long i = 1; i <=power; i++){
         baseRaisedToPower *= base;
      }
      return baseRaisedToPower % divisor;
   }


   public static void main(String[] args) {

   long startTime = System.currentTimeMillis();

   long ans = 0;

   for(int i = 0; i < 1_000_000_000; i++){
      ans = computeRemainder(2, 10, 7);
   }

   long endTime = System.currentTimeMillis();
      System.out.println(ans);
      System.out.println(endTime - startTime);

   }//main
}//class 
