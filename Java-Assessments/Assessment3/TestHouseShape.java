package ClassTest1;

/**
 * Created by laura on 12/10/2020
 * Test application
 */
public class TestHouseShape {
   public static void main(String[] args) {

      SquareHouse house1 = new SquareHouse("blue", 20, 30);
      SquareHouse house2 = new SquareHouse("green", 30, 40);

      HouseShape house3 = new HouseShape();


      System.out.println(house1);
      System.out.println(house2);
      System.out.println(house3);

      System.out.println("\nThe number of square houses created: " + SquareHouse.numberOfSquareHouses());

   }//main
}//class 
