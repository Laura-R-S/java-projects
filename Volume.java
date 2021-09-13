package Week1.Practical1;

import java.lang.*;
import java.text.DecimalFormat;


/**
 * Created by laura on 17/01/2021
 * Question 6 - calculate volume
 */
public class Volume {

   static DecimalFormat df = new DecimalFormat(".000");
   static final double PI = Math.PI;

   // calculate volume of sphere with specified diameter
   public static double volumeSphere(double d) {

      double volume;
      double p = 3;

      volume = (PI * Math.pow(d, p)) / 6;
      return volume;

   }

   // calculate volume of cylinder with specified diameter and height
   public static double volumeCylinder(double d, double h) {

      double volume;
      double p = 2;

      volume = ((PI * Math.pow(d, p)) * h) / 4;
      return volume;

   }

   public static void main(String[] args) {

      System.out.println("Sphere Diameter 10 has a volume of " + df.format(volumeSphere(10)));
      System.out.println("Cylinder Diameter 10 height 10 has a volume of " + df.format(volumeCylinder(10, 10)));

   }//main
}//class
