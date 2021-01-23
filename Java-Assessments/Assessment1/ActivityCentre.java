package Test1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Currency;

/**
 * Created by Laura Tinney on 05/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ActivityCentre
{
   public static void main(String[] args)
   {

      Scanner keyboard = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      //declaring datatype to variable identifier
      String firstName, surname;
      double priceBusParking;
      int numTicketsOrdered, parkingHours;

      //assigning constant values
      final double PARKING_COST = 15.00;
      final double JUNIOR_TICKET = 5.50;
      final String VENUE_NAME = "OutdoorFun";

      //prompt user and read in to get information
      System.out.println("Please enter your first name :");
      firstName = keyboard.nextLine();

      //prompt user and read in to get information
      System.out.println("Please enter your surname :");
      surname = keyboard.nextLine();

      //prompt user and read in to get information
      System.out.println("How many hours of parking do you need?:");
      parkingHours = keyboard.nextInt();

      //prompt user and read in to get information
      System.out.println("How many junior tickets would you like to purchase?");
      numTicketsOrdered = keyboard.nextInt();

      //calculating variables for total amounts
      double totalParking = parkingHours * PARKING_COST;
      double totalJunTickets = numTicketsOrdered * JUNIOR_TICKET;
      double overallCost = totalParking + totalJunTickets;
      double childCost = overallCost/ numTicketsOrdered;


      //output
      System.out.println(VENUE_NAME+"\n");
      System.out.println("Bill for:\t"+firstName+" "+surname);
      System.out.println("\tTotal parking hours : \t\t\t\t"+parkingHours+"\t\tCost:£"+df.format(totalParking));
      System.out.println("\tTotal number of junior tickets : \t "+numTicketsOrdered+ "\t\tCost:£"+df.format(totalJunTickets));
      System.out.println("\tTotal cost for parking and tickets: \t\t £"+overallCost);
      System.out.println("\t\t\t Cost per child : \t\t\t\t\t£"+df.format(childCost));




   }//main
}//class 
