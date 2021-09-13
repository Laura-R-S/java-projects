package Week1.Practical1;


/**
 * Created by laura on 17/01/2021
 * Question 3
 */
public class Coins {


   public static String coinPrinter(int number){

      String value = "";

      switch(number){

         case 1:
            value = "One penny";
            break;
         case 2:
            value = "Two pence";
            break;

         case 5:
            value = "Five pence";
            break;

         case 10:
            value = "Ten pence";
            break;

         case 20:
            value = "Twenty pence";
            break;

         case 50:
            value = "Fifty pence";
            break;

         case 100:
            value = "One pound";
            break;

         case 200:
            value = "Two pounds";
            break;

         default:
            value = "Invalid coin";
            break;

      }
      return value;
   }


   public static void main(String[] args) {

      int number = 2;
      System.out.println(coinPrinter(number));


   }//main
}//class 
