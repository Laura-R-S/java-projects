package Week1.Practical1;

import java.io.*;

/**
 * Created by laura on 16/01/2021
 * 1. Test the following program which uses a compound if statements, remove the
 * errors and note the output:
 */
public class TestIf {

   /* Illustrates the use of the COMPOUND if statement. */

   public static void main(String[] args) {

      int a = -4;
      int b, c;

      // if a is less than 0 then it is made positive
      if (a < 0)
         a = -a;
      
      System.out.println("The value of a = " + a);

      b = 3 * a - 5;
      c = 4 * b - 7;

      System.out.println("The value of b before if = "+ b );
      System.out.println("The value of c before if = " + c );

      // test Compound if-else construct
      if (b > 0){
         b = -b + c * 2;
         c = c + 1;
      } else {
         b = b + c * 1;
         c = c - 1;
      }

      System.out.println("The value of b after if = " + b);
      System.out.println("The value of c after if = " + c);
   } // main
} //class

