package Week1.Practical1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by laura on 25/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CoinsTest {

   Coins mc = new Coins();

   @Test
   public void coinPrinter1() {
      assertEquals(mc.coinPrinter(1), "One penny");
   }

   @Test
   public void coinPrinter2() {
      assertEquals(mc.coinPrinter(2), "Two pence");
      assertEquals(mc.coinPrinter(5), "Five pence");
      assertEquals(mc.coinPrinter(10), "Ten pence");
      assertEquals(mc.coinPrinter(20), "Twenty pence");
      assertEquals(mc.coinPrinter(50), "Fifty pence");
   }

   @Test
   public void coinPrinter3() {
      assertEquals(mc.coinPrinter(100), "One pound");
      assertEquals(mc.coinPrinter(200), "Two pounds");
   }

   @Test
   public void coinPrinter4() {
      assertNotEquals(mc.coinPrinter(2), "Invalid coin");
      assertEquals(mc.coinPrinter(3), "Invalid coin");
   }

}
