package Week4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by laura on 22/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class minMaxArrayTest {

   @Test//(expected = ArrayIndexOutOfBoundsException.class)

   public void array2DMin() {

      minMaxArray ma = new minMaxArray();

      int[][] test = new int[3][4];

      test[0][0]=1; test[0][1]=3; test[0][2]=6;
      test[0][3]=8; test[1][0]=2; test[1][1]=6;
      test[1][2]=9; test[1][3]=-1; test[2][0]=4;
      test[2][1]=5; test[2][2]=3; test[2][3]=7;

      assertEquals(ma.array2DMin(test), -1);

      //System.out.println(test[4][0]);

   }
}