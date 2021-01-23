package Bank;

import java.text.DecimalFormat;

/**
 * Created by laura on 27/10/2020
 * Mortgage Application to calculate repayments, generate and print monthly payments,
 * set number of years and interest rates
 */
public class Mortgage extends Loans {

   DecimalFormat df = new DecimalFormat("###,###.00");
   DecimalFormat df1 = new DecimalFormat(".0000");

   //class variables
   private static int mortgageID = 1000001;
   private static int noOfMortgages = 0;

   //constant variable
   final int MONTHS_IN_YEAR = 12;
   final int PERCENT = 100;
   private final int id;
   private final String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct", "Nov", "Dec"};

   //instance variables
   private int years;
   private int noOfPayments;
   private int startMonth;
   private double amount;
   private double annualIntRate;
   private double monthlyIntRate;
   private String[] paymentSchedule;

   public Mortgage () {
      id = mortgageID;
      mortgageID++;
      noOfMortgages++;
   }// Default constructor

   public Mortgage (String surname, String firstName, String email, double salary, double amount, double annualIntRate, int years, int startMonth) {
      super(surname, firstName,  email, salary);
      this.amount = amount;
      this.annualIntRate = annualIntRate;
      this.years = years;
      this.startMonth = startMonth;
      id = mortgageID;
      mortgageID++;
      noOfMortgages++;

      // these methods are called at instantiation to ensure setter updates are output on the next call
      setMonthlyIntRate();
      setNoOfPayments();

   }//Constructor

   private void setMonthlyIntRate(){
      monthlyIntRate = annualIntRate / PERCENT / MONTHS_IN_YEAR;
   }

   private void setNoOfPayments(){
      noOfPayments = years * MONTHS_IN_YEAR;
      paymentSchedule = new String [noOfPayments];
   }//method to set number of payments

   private double calculateBalance(int month) {
      return amount * (Math.pow(1 + monthlyIntRate, noOfPayments) - Math.pow(1 + monthlyIntRate, month))
            / (Math.pow(1 + monthlyIntRate, noOfPayments) - 1);
   }//method to calculate Balance 

   private void generatePaymentSchedule() {
      for (int month = 0; month < years * MONTHS_IN_YEAR; month++)
      {
         double balance = calculateBalance(month);
            paymentSchedule[month] = df.format(balance);
         }
   }// method to calculate payment schedule and store in array


   protected String printPaymentSchedule(){

      int yearCounter = 1;
      StringBuilder schedule = new StringBuilder();

      //generate schedule
      generatePaymentSchedule();
      schedule.append(("\nPayment Schedule For:   \n\n")).append(super.toString()).append("\n").append(calculateMortgage());

      for(int i = 0; i < paymentSchedule.length; i++){
         if (i % 12 == 0){
            schedule.append(("\n\t  Year ")).append(yearCounter).append("\n");
            yearCounter++;
         }
         schedule.append(month[(i + startMonth - 1) % 12]).append(" - £ ").append(paymentSchedule[i]).append("\n");
      }//for
      System.out.print(schedule);
      return schedule.toString();
   }// method to print payment schedule and month / year based on index location

   //getters and setters
   protected int getId(){

      return id;
   }

   protected double getAmount(){

      return amount;
   }
   protected void setAnnualIntRate(int annualIntRate){

      this.annualIntRate= annualIntRate;

      setMonthlyIntRate();
   }
   protected String getAnnualIntRate() {

      return "\nAnnual Interest Rate " + annualIntRate + " %";
   }

   protected String getMonthlyIntRate() {

      return "Monthly Interest Rate " + df1.format(monthlyIntRate) + " %";
   }

   protected void setYears(int years){

      this.years = years;

      setNoOfPayments();
   }
   protected int getYears(){ return years;}


   protected int getStartMonth(){
      return startMonth;
   }

   protected void setStartMonth(int startMonth){
      this.startMonth = startMonth;
   }


   protected String calculateMortgage(){

      double noOfPayments = years * MONTHS_IN_YEAR;
      double monthlyPayment = amount * (monthlyIntRate * Math.pow(1 + monthlyIntRate, noOfPayments)
            / (Math.pow(1 + monthlyIntRate, noOfPayments) - 1));

      return "\n===============================================" +
             "\n\t" + getType() +
             "\n\nAmount being borrowed: £" + df.format(amount) +
             "\nAnnual interest rate: " + df1.format(annualIntRate) + "%" +
             "\nMonthly interest rate: " + df1.format(monthlyIntRate) + "%" +
             "\nDuration: "+ years + " years"+
             "\nMonthly Mortgage Payment: £" + df.format(monthlyPayment) + "\n";
   } // method to calculate mortgage payments

   public static String getNoOfMortgages(){
      return "The number of Mortgages : " + noOfMortgages;
   } //method to get number of Mortgages

   public String toString(){
      return "The Mortgage ID is " + id + "\n" +  super.toString() +
            "\n" + calculateMortgage() + "\n";
   }  // toString to return all mortgage details and overrides method in Loans

   protected String getType() {
      return "----Mortgage----";
   }// implements method in Loans abstract class
}//class
