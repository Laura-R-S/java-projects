package ClassTest1;

/**
 * Created by laura on 12/10/2020
 * Super class to store information on geometric house shapes
 */
public class HouseShape {

   //instance variable
   private String colour;

   public HouseShape() {

      colour = "yellow";
   }// Default constructor

   public HouseShape(String pColour) {

      colour = pColour;
   }// Constructor

   public String toString() {
      return "The House Shape colour is: " + colour;
   }  // toString to return the colour of the house

}//class
