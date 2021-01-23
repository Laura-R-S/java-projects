package ClassTest2;


/**
 * Created by laura on 09/11/2020
 * Assessments application to test methods
 */
public class Assessment2 {

   public static int method1(int minimumNum) {

      //array to hold ints
      int[] list = {34, 56, 23, 35, 78, 44, 60, 20, 31, 61};
      int lowest = 0;

      //for loop to loop elements in array to find smallest two
      for (int i = 0; i < list.length; i++)
      {
         for (int j = i + 1; j < list.length; j++)
         {
            if (list[i] < list[j] && list[i] > minimumNum)
            {
               lowest = list[i];
               list[i] = list[j];
               list[j] = lowest;
            }
         }
      }
      return lowest;
   }

   public static void method2() {

      System.out.print("The new list is ");

      int[] list = {34, 67, 23, 45, 69, 30};

      int first = 0;

      for (int i = 0; i < list.length; i++) {
         if(i == 0) {
            first = list[0];
         }
         for(int j = 0; j < list.length; j++) {
            if(list.length > i+i){
               list[i] = list[i+1];
            }
         }
         list[list.length -1] = first;
         System.out.print(list[i] + " ");
      }

   }

   public static void main(String[] args) {

//method calls for method1
      int lowestNum1 = method1(0);
      int lowestNum2 = method1(lowestNum1);


      System.out.println("The two smallest numbers in the list are " + lowestNum1 + " and " + lowestNum2);

      //method call method2
      method2();

   }//main
}//class 
