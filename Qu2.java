package Week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by laura on 24/01/2021
 * Week 2 Qu 2
 */
public class Qu2 {

   public static void readNumbers(String fname) throws IOException {

      int count = 0;

      try {
         FileReader fr = new FileReader(fname);
         BufferedReader br = new BufferedReader(fr);

         String myFile = br.readLine();

         while (myFile != null) {
            count += Integer.parseInt(myFile);
            myFile = br.readLine();
         }
         br.close();
         fr.close();
         System.out.println("Total number is " + count);
      } catch (
            IOException e) {
         System.out.println(e);
      }
   }

   public static void main(String[] args) throws IOException {

      readNumbers("fifty.txt");

   }//main
}//class 
