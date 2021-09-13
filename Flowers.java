package Week5;

/**
 * Created by laura on 15/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Flowers {


   public static void emptyVase (int flowersInVase){

      if (flowersInVase > 0){
         System.out.println(flowersInVase); //7
         emptyVase(flowersInVase -1);  // 6,5,4,3,2,1
         System.out.println(flowersInVase);
      }else{
         System.out.println("Vase is empty");
      }//else

   }//emptyVase

   public static void main(String[] args) {

      emptyVase(7); // returned 1,2,3,4,5,6,7

   }//main
}//class 
