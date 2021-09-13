package Week2;

import java.io.*;

/**
 * Created by laura on 24/01/2021
 * Week 2 Qu 3
 */
public class Qu3 {

   public static int countTotalPositiveValues(String filename)  {

      int count = 0;
      int num = 0;

      try {
         FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);
         String myfile = br.readLine();

         while (myfile != null) {

            num = Integer.parseInt(myfile);
            if (num > 0) {
               count+=num;

            }
            myfile = br.readLine();
         }

         br.close();
         fr.close();

      } catch (IOException e) {
         System.out.println(e);
      }
      return count;
   }

   public static void writeToFile(String[] data, String filename){

      try {
         FileWriter fw = new FileWriter(filename);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw);

         for (int i = 0; i < data.length; i++) {
            pw.println(data[i]);
         }

         pw.close();
         bw.close();
         fw.close();

      } catch (IOException e) {
         System.out.println(e);
      }
   }


   public static void main(String[] args) throws IOException {

      int[] data = {23, 65, 54, 65, 75, 43, 54, 65, 65};
      String[] data1 = {"one", "two", "three", "four", "five"};

      System.out.println(countTotalPositiveValues("twenty.txt"));
      //writeToFile(data, "qu4b.txt");
      writeToFile(data1, "qu4b.txt");


   }//main
}//class 
