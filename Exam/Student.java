/*
   Name: Marc Lawrence C. Magadan
   Date and Time: 05/26/2023 10:27am
   Description: Finals coding in Java
*/

import java.util.*;

class Student {
   private String lastname; // Stores the last name of the student
   private String firstname; // Stores the first name of the student
   private char mi; // Stores the middle initial of the student
   private int gradeLevel; // Stores the grade level of the student
   private String section; // Stores the section of the student
   private double[] gradeArray; // Stores the grades of the student

   Student(String lastn, String firstn, char middlei, int gradelvl, String section) {
      this.firstname = firstn;
      this.lastname = lastn;
      this.mi = middlei;
      this.gradeLevel = gradelvl;
      this.section = section;
      int numSubjects = getSubjects(gradelvl);
      this.gradeArray = new double[numSubjects];
   }

   // Returns the number of subjects based on the grade level
   private int getSubjects(int gradelvl) {
      if (gradelvl == 1) {
         return 5;
      } else if (gradelvl == 2) {
         return 6;
      } else if (gradelvl == 3) {
         return 7;
      }
      return 0;
   }

   // Swaps two grades in the grade array
   private void swap(double[] grades, int i, int j) {
      double temp = grades[i];
      grades[i] = grades[j];
      grades[j] = temp;
   }

   // Sorts the grades in ascending order 
   private void sortGrades() {
      int n = gradeArray.length;
      for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
       if (gradeArray[i] > gradeArray[j]) {
         swap(gradeArray, i, j);
         }
      }
   }
}

   // Gets the grades from the user for the student
   private void getGrades() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter grades for " + firstname + " " + lastname + ":");
      
      for (int i = 0; i < gradeArray.length; i++) {
         System.out.print("Grade " + (i + 1) + ": ");
         gradeArray[i] = scanner.nextDouble();
         
         while (gradeArray[i] < 1.0 || gradeArray[i] > 5.0) {
            System.out.println("Invalid grade! Please enter a grade between 1.0 and 5.0.");
            System.out.print("Grade " + (i + 1) + ": ");
            gradeArray[i] = scanner.nextDouble();
         }
      }
   }

   // Displays the details of the student including name, grade level, section, and grades
   private void displayStudentDetails() {
      System.out.println("Student: " + firstname + " " + lastname);
      System.out.println("Year Level: " + gradeLevel);
      System.out.println("Section: " + section);
      System.out.print("Grades: ");
      sortGrades();
      for (double grade : gradeArray) {
         sortGrades();
         System.out.print(grade + " ");
      }
   
      displayGradeAverage();
   }

   // Calculates and displays the average grade of the student
   private void displayGradeAverage() {
      double sum = 0.0;
      for (double grade : gradeArray) {
         sum += grade;
      }
      double average = sum / gradeArray.length;
      System.out.printf("Average: %.2f\n", average);
   }

   public static void main(String[] args) {
      Student john = new Student("Cruz", "John", 'A', 1, "1A");
      Student kiera = new Student("Dy", "Kiera", 'C', 2, "2B");
      Student nic = new Student("Kage", "Nick", 'T', 3, "3C");
   
      john.getGrades();       // for john
      kiera.getGrades();      // for jiera
      nic.getGrades();        // for nic
   
      System.out.println();
      john.displayStudentDetails();  //displays john's grades and average
      System.out.println();
   
      kiera.displayStudentDetails(); //displays kiera's grades and average
   
      System.out.println();
   
      nic.displayStudentDetails();   //displays nic's grades and average
   
   }
}
