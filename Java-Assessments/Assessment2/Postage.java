package LabTest2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by laura on 02/09/2020
 * Calculate how much postage a person is required
 * to pay, to send some parcels
 */
public class Postage {

   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat(".00");

   //method to read in and return name
   public static String getName(String name){

      System.out.print("Please enter your "+name+": ");
      return keyboard.nextLine();
   }

   //method to read in and return number of parcels
   public static int getNumber(){

      System.out.print("\nHow many parcels have you? ");
      return keyboard.nextInt();
   }

   //method to calculate and return total weight
   public static double getWeight(int numOfParcels){

      double weight, totalWeight = 0;

      // for loop to get parcel weights
      for(int parcel = 1; parcel <= numOfParcels; parcel++ ){

         System.out.print("Please enter the weight of package " + parcel + " (in kg): ");
         weight = keyboard.nextDouble();
         totalWeight = totalWeight + weight;
      }
         return totalWeight;

   }

   //method to calculate and return cost
      public static double costOfPostage(double totalWeight){ //passing in formal parameters
         //constants
         final double COST1= 8.00;
         final double COST2 = 15.00;
         final double COST3 = 20.00;

         if(totalWeight <= 5){
            return COST1;
         }else if ((totalWeight > 5) && (totalWeight < 10)){
            return COST2;
         }else{
            return COST3;
         }

      }

   //method to return full name Upper case
      public static String getFullName(String firstName, String surname){
         return firstName.toUpperCase()+" "+surname.toUpperCase();
      }

   public static void main(String[] args) {
      // actual parameters
      String firstName,surname;
      int numOfParcels;
      double totalWeight, totalCost;

      //calling methods
      firstName = getName("first name");
      surname = getName("surname");
      numOfParcels = getNumber();
      totalWeight = getWeight(numOfParcels);
      totalCost = costOfPostage(totalWeight);

      // output results
      System.out.println("\nName:\t\t\t\t\t\t\t"+getFullName(firstName, surname));
      System.out.println("Number of parcels:\t\t\t\t" +numOfParcels);
      System.out.println("Total weight of parcels:\t\t"+df.format(totalWeight)+"kgs");
      System.out.println("Cost of postage:\t\t\t\t£"+df.format(totalCost));

   }//main
}//class 
