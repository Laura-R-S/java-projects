package Bank;

import java.util.Scanner;

/**
 * Created by laura on 27/10/2020
 * Applicant Sub Class with method to select the type of loan using a switch statement,
 * method to return full address, implement getLoan method and override toString in Super class,
 * method to get number of applicants
 */
public class Applicant extends Loans{

   static Scanner kb = new Scanner(System.in);

   //class variable
   private static int noOfApplicants = 0;
   private static int applicantID = 1000001;

   //instance variables
   private int id;
   private String addressLine1, addressLine2, postcode;

   public Applicant() {
      id = applicantID;
      applicantID++;
      noOfApplicants++;
   }//default constructor

   public Applicant(String surname, String firstName, String email, double salary, String addressLine1, String addressLine2, String postcode) {
      super(surname, firstName, email, salary);
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.postcode = postcode;
      id = applicantID;
      applicantID++;
      noOfApplicants++;

   }//constructor


   public static int applicationLoanSelection()
   {
      int typeOfLoan;

      System.out.println("1. Mortgage");
      System.out.println("2. Car Loan");
      System.out.println("3. Personal Loan");
      System.out.println("4. Business Loan");

      System.out.println("Please enter a number from the menu to select which type of loan you would like to apply for: ");
      typeOfLoan = kb.nextInt();

      switch (typeOfLoan)
      {
         case 1:
            System.out.println("The customer is applying for a Mortage\n");
            break;
         case 2:
            System.out.println("The customer is applying for a Car Loan\n");
            break;
         case 3:
            System.out.println("The customer is applying for a Personal Loan\n");
            break;
         case 4:
            System.out.println("The customer is applying for a Business Loan\n");
            break;
         default:
            System.out.println("Invalid, please enter a number between 1-4: ");
      }
      return typeOfLoan;
   }


   public String getFullAddress() {

      return "===== Address ===== \n" + addressLine1 + "\n" + addressLine2 + "\n" + postcode + "\n\n";
   }

   protected String getType() {
      return "Applicant";
   }

   public String getNoOfApplicants() {
      return "The number of Applicants : " + noOfApplicants + "\n";
   } //method to get number of Applicants

   public String toString() {

      return "\n==== " + getType() + " Details ====\n" +
            "\n" + super.toString() +
            "\n" + getFullAddress() +
            "Applicant Number: " + id + "\n";
   } // toString to return all details

}//class