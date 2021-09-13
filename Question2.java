package Week1.Practical1;

/**
 * Created by laura on 17/01/2021
 * 2. Develop a program that sets the variables, p, q, r, s, t
 */
public class Question2 {

   public static void main(String[] args) {

      int p = 7;
      int q = -4;
      int r = 3 * p + 4 * q;
      int s = 5 * p + 6 * r;

      int t;

      if (r > s){
         t = p + q + r;
      }else{
         t = p + q + s;
      }

      System.out.println("The value of p = " + p);
      System.out.println("The value of q = " + q);
      System.out.println("The value of r = " + r);
      System.out.println("The value of s = " + s);
      System.out.println("The value of t = " + t);


   }//main
}//class 
