package Week2;

import java.io.*;

/**
 * Created by laura on 24/01/2021
 * Week 2 - Qu 1
 */
public class Qu1 {

   public static void writeNumbers(String fname, int num ) throws IOException {

      try {
         FileWriter fw = new FileWriter(fname);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for (int i = 1; i <= num; i++) {
            pw.println(i);
            System.out.println((i));
         }
         bw.close();
         pw.close();
         fw.close();
      } catch (IOException e) {
         System.out.println(e);
      }
   }
   public static void main(String[] args) throws IOException {

    writeNumbers("fifty.txt", 50);

   }//main
}//class 
