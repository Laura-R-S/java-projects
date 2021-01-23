package Revision;

import java.util.Scanner;

/**
 * Created by laura on 27/08/2020
 * Program to calculate retirement age
 */
public class practice
{

   static Scanner keyboard = new Scanner(System.in);

   public static String getReadin(String text){

      System.out.println("Please enter your "+text);
      return keyboard.nextLine();
   }
   public static int getReadInt(String text){

      System.out.println("Please enter your "+text);
      return keyboard.nextInt();
   }

   public static String getFullName(){
      String fullName, firstName, middleName, lastName;
      firstName = getReadin("first name: ");
      middleName = getReadin("middle name: ");
      lastName = getReadin("last name: ");
      fullName = firstName+" "+middleName.charAt(0)+". "+lastName;
      return fullName;
   }

   public static int getAgeFromYear(int yearOfBirth){
         final int YEAR = 2020;
         return YEAR - yearOfBirth;
   }

   public static int getYearsTillRetirement(int yearOfBirth){
      final int RETIREMENT_AGE = 65;
       return RETIREMENT_AGE - getAgeFromYear(yearOfBirth);
   }

   public static String getTitle(String gender) {

      if (gender.equals("female")) {
         return "Mrs";
      } else {
         return "Mr";
      }
   }

   public static void main(String[] args)
   {
      String gender;
      String fullName, title;
      int yearOfBirth, age, retirementYears;

      fullName = getFullName();
      gender = getReadin("gender: ");
      yearOfBirth = getReadInt("year of birth: ");
      age = getAgeFromYear(yearOfBirth);
      retirementYears = getYearsTillRetirement(yearOfBirth);
      title = getTitle(gender);

      System.out.println("Hello "+title+" "+fullName+", you were born in "+yearOfBirth+", you are "+age+
            " years old, only "+retirementYears+" years until retirement!");

   }//main
}//class 
