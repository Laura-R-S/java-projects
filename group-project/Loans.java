package Bank;

import java.text.DecimalFormat;

/**
 * Created by laura on 27/10/2020
 * Loan Super Class with abstract method modifier to implement Loan type in sub classes
 * toString method that override method in object and name, email and salary is overridden by sub classes
 */
abstract public class Loans {

   DecimalFormat df = new DecimalFormat("00,000.00");

   private String surname, firstName,  email;
   private double salary;

   public Loans() {
   }//default constructor

   public Loans(String surname, String firstName, String email, double salary){
      this.surname = surname;
      this.firstName = firstName;
      this.email = email;
      this.salary = salary;
   }//constructor

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   abstract protected String getType(); // abstract method modifier

   public String toString(){
      return "Applicant surname: " + surname +
            "\nApplicant FirstName: " + firstName +
            "\nEmail Address: " + email +
            "\nSalary: £" + df.format(salary) + "\n";
   } // toString to return name and email

}//class

