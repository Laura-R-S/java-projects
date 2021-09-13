package Week5;

/**
 * Created by laura on 15/02/2021
 * Qu2 Fibonacci
 */
public class Fibonacci2 {

   public static int getFib(int n){

      if(n-2 >= 0){
         System.out.println(n);
         n = getFib(n -1) + getFib(n - 2);
         //System.out.println(n);
      }
     return n;
   }

   public static void main(String[] args) {

      System.out.println("Fibonacci: " +  getFib(4));

   }//main
}//class 
