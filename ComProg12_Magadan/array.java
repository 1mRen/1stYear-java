import java.util.Scanner;
// Marc Lawrence C. Magadan     BSIT - 1B
public class array{
   //method for swapping of elements in an array
   public static void swap(int[] arr, int x, int y){
      int temp = arr [x];
      arr[x] = arr[y];
      arr[y] = temp;
   }
   //main method
   public static void main(String[] args){
      //declaring variables
      int i ;
      float avg, sum = 0;
      Scanner obj = new Scanner(System.in);
      int [] gradeArr = new int [5];
      
      System.out.print("Note: You can only enter whole numbers.\n\n");

      System.out.print("Enter 5 grades");
      //asks user to input 5 grades80 loop
      for(i = 0; i < gradeArr.length; i++){

         System.out.printf("\nEnter grade #%d: ", i+1);
         gradeArr[i] = obj.nextInt();
      }

      //outputs the inputted grades
      System.out.print("\nEntered grades\n");
      for (int arr: gradeArr){
         System.out.print(arr + " ");
      }
      // sorting the elements from lowest to highest loop
      for( i=0; i < gradeArr.length-1;i++) {
         for (int j = i; j < gradeArr.length; j++)
            if (gradeArr[i] > gradeArr[j]) {
               swap(gradeArr, i, j);
            }
      }
      // adding the elements inside an array loop
      for (i = 0; i < gradeArr.length; i++) {
         sum += gradeArr[i];
      }

      //Outputs the ascending ordered array
      System.out.println("\n\nGrades sorted in ascending order");
      for(int arr2 : gradeArr){
         System.out.print(arr2 + " ");
      }
      //computation for the average
      avg = sum/gradeArr.length;

      //outputs the expected smallest grade, largest grade, and the average.
      System.out.print("\n\nSmallest grade: " + gradeArr[0]);
      System.out.print("\nLargest grade: " + gradeArr[4]);
      System.out.printf("\nAverage: %.2f", avg);
   }
}