package Lab3;


/**
 * Created by laura on 30/07/2020
 * Two flower shops
 */
public class FlowerShop
{
   //instance fields
   String typeOfFlower;
   int numInBunch;
   boolean areTheyFresh;
   double priceOfFlower;

   //constructor method
   public FlowerShop(String flower, int bunchSize, boolean freshness, double price)
   {

      typeOfFlower = flower;
      numInBunch = bunchSize;
      areTheyFresh = freshness;
      priceOfFlower = price;

   }
   //main method
   public static void main(String[] args)
   {

      FlowerShop myBlooms = new FlowerShop("Rose", 20, true, 20.99);
      FlowerShop daisyDays = new FlowerShop("lily", 40, false, 45.00);
      boolean biggerBunch = myBlooms.numInBunch > daisyDays.numInBunch;
      int totalExtra = daisyDays.numInBunch - myBlooms.numInBunch;

      System.out.println("The flowers in the window are " + myBlooms.typeOfFlower + "s , you can get " + myBlooms.numInBunch + " in a bunch.");
      System.out.println("The cost of the roses are £" + myBlooms.priceOfFlower + " and the cost of the lillis are £" + daisyDays.priceOfFlower);
      System.out.println("The statement myBlooms had a bigger bunch is " + biggerBunch);
      System.out.println("The difference in bunch size " + totalExtra);


   }
}

