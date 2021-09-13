package Revision;

import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by laura on 11/02/2021
 * COMMENTS ABOUT PROGRAM HERE
 */
public class OneToTen {
   public static void main(String[] args) {


      Set<Integer> OneToTen = new HashSet<>();
      Set<Integer> TenToTwenty = new HashSet<>();

      OneToTen.add(1);
      OneToTen.add(2);
      OneToTen.add(3);
      OneToTen.add(4);
      OneToTen.add(5);
      OneToTen.add(6);
      OneToTen.add(7);
      OneToTen.add(8);
      OneToTen.add(9);
      OneToTen.add(10);

      System.out.println("Set 1 = " + OneToTen);

      TenToTwenty.add(11);
      TenToTwenty.add(12);
      TenToTwenty.add(13);
      TenToTwenty.add(14);
      TenToTwenty.add(15);
      TenToTwenty.add(16);
      TenToTwenty.add(17);
      TenToTwenty.add(18);
      TenToTwenty.add(19);
      TenToTwenty.add(20);

      System.out.println("Set 2 = " + TenToTwenty);
//
//      OneToTen.addAll(TenToTwenty);
//
//      System.out.println("After adding together = " + OneToTen);









   }//main
}//class 
