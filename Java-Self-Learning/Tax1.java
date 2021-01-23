package Revision;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by laura on 27/08/2020
 * Program to work out netpay
 */
public class Tax1 {
   static Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("00.00");

   //method to read in grossPay
   public static double getGrossPay(String text)
   {
      System.out.println("Enter your gross pay " + text);
      return keyboard.nextDouble();
   }
   // method to calculate if exempt from paying tax
   public static double netPay(double grossPay)
   {
      final double TAXLEVEL = 10000;

      if (grossPay <= TAXLEVEL){
         return grossPay;
      }else return afterTax(grossPay);
   }

   //method to calculate netPay
   public static double afterTax(double grossPay) {
      final double TAXRATE = 0.20;
      return grossPay - (grossPay * TAXRATE);
   }

   public static void main(String[] args)
   {
      double grossPayY1, netPayY1, grossPayY2, netPayY2;
      //read in gross pay
      grossPayY1 = getGrossPay("in year 1 £");
      grossPayY2 = getGrossPay("in year 2 £");

      //gets information from net pay method
      netPayY1 = netPay(grossPayY1);
      netPayY2 = netPay(grossPayY2);
      System.out.println("Your net pay in year 1 is £"+netPayY1);
      System.out.println("Your net pay in year 2 is £"+netPayY2);

   }//main}
}// class
