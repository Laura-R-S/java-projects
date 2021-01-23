package Bank;

import java.io.*;
import java.util.Scanner;

/**
 * Created by laura on 27/10/2020
 * Test Class for Applicant and Mortgage to instantiate objects of the Mortgage and Applicant Class
 * try/catch statements to read in text files and use information to instantiate new objects
 */
public class TestMortgage {

   static PrintWriter myOutFile;
   static FileReader customerFile, applicantFile, mortgageFile;
   static Scanner readMyFile;
   static Scanner kb = new Scanner(System.in);

   public static void main(String[] args) {

       // Declaring variables for user input

      String customerSurname, customerFirstName, customerEmail, addressLine1, addressLine2, postcode;
      int startMonth, amount, years;
      double salary, interestRate;


      //Using the Scanner class to get user input and assigning input to variables


      System.out.print("Please enter customer surname: ");
      customerSurname = kb.nextLine();
      System.out.print("Please enter customer first name: ");
      customerFirstName = kb.nextLine();
      System.out.print("Please enter the customer email address: ");
      customerEmail = kb.nextLine();
      System.out.print("Please enter the annual salary:");
      salary = kb.nextDouble();
      kb.nextLine();

      System.out.print("Please enter the first line of the address: ");
      addressLine1 = kb.nextLine();
      System.out.print("Please enter the second line of the address: ");
      addressLine2 = kb.nextLine();
      System.out.print("Please enter the postcode: ");
      postcode = kb.nextLine();

      System.out.print("Please enter amount you would like to borrow: ");
      amount = kb.nextInt();
      System.out.print("Please enter the current Interest Rate : ");
      interestRate = kb.nextDouble();
      System.out.print("Please enter years : ");
      years  = kb.nextInt();
      System.out.print("Please enter a number(1 (Jan) - 12 (Dec) to indicate which month the mortgage is going to start: ");
      startMonth = kb.nextInt();


      // Passing variables from the user input into the constructors


      Applicant applicant1 = new Applicant (customerSurname, customerFirstName, customerEmail, salary, addressLine1, addressLine2, postcode);
      System.out.println(applicant1);

      //user can output how many applicants at any stage in the application
      System.out.println(applicant1.getNoOfApplicants());

      Mortgage mortgage1 = new Mortgage(applicant1.getSurname(), applicant1.getFirstName(), applicant1.getEmail(), applicant1.getSalary(),amount, interestRate, years, startMonth);
      System.out.println(mortgage1);
      System.out.println(Mortgage.getNoOfMortgages());

      /*
       * Hard Coding applicant details and using details
       * to instantiate mortgage applicant using the (.) operator
       */

      Applicant applicant2 = new Applicant("Bloggs", "Joe", "hello@hotmail.co.uk", 30000, "StreetName Avenue", "Town", "BT12 3AB");
      System.out.println(applicant2);
      System.out.println(applicant2.getNoOfApplicants());

      Mortgage mortgage2 = new Mortgage(applicant2.getSurname(), applicant2.getFirstName(), applicant2.getEmail(), 30000, 100000, 3, 2, 4);
      System.out.println(mortgage2);

      /*
       * Set/Get annual interest rate
       * Set/Get number of years
       * Printing Payment Schedule
       */

      //before changes
      //mortgage2.printPaymentSchedule();

      //setter to change interest annual interest rate
      mortgage2.setAnnualIntRate(2);
      //setter to change number of years
      mortgage2.setYears(7);

      //Getter to print out changed annual interest rate and mo
      System.out.println(mortgage2.getAnnualIntRate());
      System.out.println(mortgage2.getMonthlyIntRate());

      //after changes
      //mortgage2.printPaymentSchedule();

      /*
       * Exception Handling and File Management Techniques
       * try / catch to open new file and write Payment Schedule to file
       */

      //assign mortgage variable to file
      String mortgage = "C:\\Users\\laura\\Java2\\Mortgage.txt";
      boolean open = false;

      try {
         myOutFile = new PrintWriter(mortgage);
         open = true;
         System.out.println("\nFile opened successfully");
      }//try
      catch (FileNotFoundException error) {
         System.out.println("Error opening the file");
      }//catch

      try {
         while (open) {
            myOutFile.println(mortgage2.printPaymentSchedule());
            myOutFile.println();
            myOutFile.close();
            System.out.println("\nPayment Schedule successfully written to file and closed");
            System.out.println("End of File\n");
            open = false;
         }//while
      }//try
      catch (Exception error) {
         System.out.println("Exception" + error.getMessage() + " caught");
      }//catch


      /*
       * try / catch to check if customer already has a mortgage application on file
       * example below does not have a file
       */


      try {
         customerFile = new FileReader("C:\\Users\\laura\\Java2\\Mortgage2.txt");
         readMyFile = new Scanner(customerFile);
         System.out.println("This customer already has a previous Mortgage Application\n");
      }//try
      catch (FileNotFoundException error) {
         System.out.println("Checked customer records and no file was found for previous application");
         System.out.println("Error Message: " + error.getMessage() + "\n");
      }//catch


      /*
       * try / catch to read in applicant details from a file
       * instantiate a new applicant and pass them to a parameter list in the signature
       */


      try {
         applicantFile = new FileReader("C:\\Users\\laura\\Java2\\Applicant.txt");
         readMyFile = new Scanner(applicantFile);
         System.out.println("File successfully read in ");
      }//try
      catch (FileNotFoundException error) {
         System.out.println("Cannot open input file ");
         System.out.println(error.getMessage());
      }//catch


      // Array to hold read in from file
      String[] applicantDetails = new String[7];
      String words;

      try {
            for (int i = 0; i < applicantDetails.length; i++) {
               words = readMyFile.nextLine();
               applicantDetails[i] = words;
            }//for
         System.out.println("Successfully read in and closed");
      }//try
      catch (Exception error) {
         System.out.println("Error reading from file");
         System.out.println("Exception " + error.getMessage() + " caught");
      }//catch

      Applicant applicant3 = new Applicant(applicantDetails[0], applicantDetails[1],applicantDetails[2],Double.parseDouble(applicantDetails[3]),applicantDetails[4],applicantDetails[5],applicantDetails[6]);


      /*
       * try / catch to read in mortgage details from a file
       * instantiate a new mortgage and pass them to a parameter list in the signature along with applicant details
       */


      try {
         mortgageFile = new FileReader("C:\\Users\\laura\\Java2\\MortgageDetails.txt");
         readMyFile = new Scanner(mortgageFile);
         System.out.println("File successfully read in ");
      }//try
      catch (FileNotFoundException error) {
         System.out.println("Cannot open input file ");
         System.out.println(error.getMessage());
      }//catch

      //Array to hold read in from file
      double[] mortgageDetails = new double[4];
      double numbers;


      try {
         for (int i = 0; i < mortgageDetails.length; i++) {
            numbers = readMyFile.nextDouble();
            mortgageDetails[i] = numbers;
         }//for
         System.out.println("Successfully written to file and closed");
      }//try
      catch (Exception error) {
         System.out.println("Error reading from file");
         System.out.println("Exception " + error.getMessage() + " caught");
      }//catch

      Mortgage mortgage3 = new Mortgage(applicant3.getSurname(), applicant3.getFirstName(), applicant3.getEmail(), applicant3.getSalary(),mortgageDetails[0], mortgageDetails[1], (int)(mortgageDetails[2]),(int)mortgageDetails[3]);
      mortgage3.printPaymentSchedule();

   }//main
}//class
