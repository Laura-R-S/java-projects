package ClassTest1;

/**
 * Created by laura on 12/10/2020
 * Sub-class called SquareHouse
 */
public class SquareHouse extends HouseShape {

   //class variable
   private static int noOfSquares = 0;

   //instance variables
   private int length;
   private int width;

   public SquareHouse(String pColour, int pLength, int pWidth) {

      super(pColour);
      length = pLength;
      width = pWidth;
      noOfSquares++;
   }// Constructor

   private int area() {

      return length * width;
   } // private method to return area

   public String toString() {
      return super.toString() + "\nThe area of the house is: " + area() + " sq\n";
   }  // toString() to return the area and super toString()

   public static int numberOfSquareHouses() {
      return noOfSquares;
   } //method to get number of squares created


}//class 
