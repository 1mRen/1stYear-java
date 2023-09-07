import java.util.*;
// Marc Lawrence C. Magadan BSIT - 1B

public class gradingSystem {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      double total = 0, totalU = 0.0; // Initialize total and totalU to 0
      int n;
      int numValidGrade = 0;
      
      System.out.print("GWA (General Weighted Average) Grading System\n");
      
      do {
         System.out.print("Enter the number of grades you want to process (must be 2 grades): ");
         n = obj.nextInt();
      } while (n == 1); // Fix the condition to ensure the user inputs 2 grades
      System.out.println("\nNow enter the " + n + " grades you want to process\n");
      
      // Loop through each grade
      for (int i = 1; i <= n; i++) {
         System.out.print("Enter grade #" + i + ": ");
         double grade = obj.nextDouble();
         if (grade >= 1.0 && grade <= 5.0) {
            numValidGrade++;
            System.out.print("Enter units for the grade #" + i + ": ");
            double gradeU = obj.nextDouble();
            total += grade * gradeU; // Calculate total score by multiplying grade and gradeU
            totalU += gradeU;
         } else {
            System.out.println("*Invalid entry. Grade must be from 1.0 to 5.0*");
            i--; // Decrement i to repeat the loop for the same grade
         }
      }
      
      if (numValidGrade == n) { // Check if all entered grades are valid
         double GWA = total / totalU;
         System.out.printf("\nGWA => %.2f%n", GWA);
      } else {
         System.out.println("*Invalid input. Please try again*");
      }
   }
}
