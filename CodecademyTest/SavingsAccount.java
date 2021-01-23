package CodecademyTest;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Laura Tinney on 07/08/2020
 * This program defines methods and a toString
 */
public class SavingsAccount
{

   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("00.00");

   //instance fields
   double balance;
   String surname;

   // constructor

  public SavingsAccount(double initialBalance)
   {
      balance = initialBalance;

   }

   public void setCustomerSurname()
   {
      System.out.println("Please enter your surname: ");
      surname = keyboard.nextLine();
   }

   public void checkBalance()
   {
      System.out.println("Your balance is " + balance + "\n");
   }

   public double deposit(double amountToDeposit)
   {

      System.out.println("Please enter how much you would like to deposit: £");
      amountToDeposit = keyboard.nextDouble();
      balance = amountToDeposit + balance;
      return amountToDeposit;
   }

   public double withdraw(double amountToWithdraw)
   {

      System.out.println("Please enter how much you would like to withdraw: £");
      amountToWithdraw = keyboard.nextDouble();
      balance = balance - amountToWithdraw;
      return amountToWithdraw;
   }

   public String toString()
   {
      return "Your new balance is £" + balance;
   }

   public static void main(String[] args)
   {
      SavingsAccount savings = new SavingsAccount(3000);

      savings.setCustomerSurname();

      System.out.println("Hello Mr " + savings.surname + ". Welcome to your bank.\n");

      savings.checkBalance();

      System.out.println("You have deposited £" + savings.deposit(0) + "\n");

      System.out.println("You have deposited £" + savings.withdraw(0) + "\n");

      System.out.println(savings);

   }//main

}//class 
