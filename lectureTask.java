package Week2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by laura on 24/01/2021
 * Lecture Task
 */
public class lectureTask {
   public static void main(String[] args) throws IOException {


         FileReader fr = new FileReader("data.txt");
         BufferedReader br = new BufferedReader(fr);
         String c = br.readLine();

         int total = 0;

         while( c != null) {
            total += Integer.parseInt(c);
            c = br.readLine();
         }
         System.out.println(total);
         br.close();
         fr.close();
      }//main
   }//class
