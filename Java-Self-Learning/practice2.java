package Revision;

import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * Created by laura on 27/08/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class practice2
{
   static Scanner keyboard = new Scanner(System.in);

   public static String getStringFromKeyboard(String text) {
      System.out.println("Please enter " + text);
      return keyboard.nextLine();
   }

   public static int getIntFromKeyboard(String text) {
      int num;
      System.out.println("Please enter " + text);
      num = keyboard.nextInt();
      keyboard.nextLine();
      return num;
   }

   public static String getFullName() {
      String firstName, middleName, lastName;

      firstName = getStringFromKeyboard("first name");
      middleName = getStringFromKeyboard("middle name");
      lastName = getStringFromKeyboard("last name");

      return firstName + " " + middleName.charAt(0) + ". " + lastName;
   }

   public static int getAge(int dateOfBirth){
      return 2020 - dateOfBirth;
   }

   public static int yrsTillRetirement(int age) {
      return 65 - age;
   }

   public static String getTitle(String gender) {
      return gender.equals("male") ? "Mr" : "Mrs";
   }

   public static void main(String[] args) {
      String fullname, gender;
      int DOB, yrsTillRetirement, age;

      fullname = getFullName();
      DOB = getIntFromKeyboard("DOB");
      gender = getStringFromKeyboard("gender");
      age = getAge(DOB);
      yrsTillRetirement = yrsTillRetirement(age);

      System.out.println("Hello " + getTitle(gender) + " " + fullname + ", you were born in " + DOB + ", you are " + age + " years old, only " + yrsTillRetirement + " years till retirement!");

   }//main
}//class 
