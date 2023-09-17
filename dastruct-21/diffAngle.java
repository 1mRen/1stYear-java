/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magadan;
import java.util.Scanner;
/**
 *
 * Marc Lawrence C. Magadan
 */

public class diffAngle {
    static Scanner scanner = new Scanner(System.in);    // Scanner to read input
  
    private static void reverse(int y, int n){     // Function to reverse a square matrix in 90-degree increments
        
        int [][] m = new int [y][n];
        
        for (int i = 0; i < y; i++) {     // Input elements for the matrix
            System.out.printf("Enter element at row %d# ", i+1);
            for (int j = 0; j < n; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        
        int len = m.length;
        
        for(int i=0; i<len/2;i++){          //Rotate the matrix in 90-degree increments
            for(int j=i; j<len-1-i;j++){
                //store the top elements
                int temp = m[i][j];
                
                //Move elements from right to top
                m[i][j] = m[j][len-1-i];
                //Move elements from bottom to right
                m[j][len-1-i] = m[len-1-i][len-1-j];
                //Move elements from left to bottom
                m[len-1-i][len-1-j] = m[len-1-j][i];
                //Move the stored top element to the left
                m[len-1-j][i] = temp;
            }
        }
        displayM(m);        //// Display the rotated matrix
    }
    
    private static void displayM(int [][]m){        // Function to display a matrix
        for(int i=0;i<m.length;i++){
            for(int j=0; j<m[0].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }    

public static void main(String[] args) {
    int rows, columns;
    
    while (true) {
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        
        // Check if the number of columns matches the number of rows
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        // Validate input: rows and columns must be the same and within the range of 3 to 100
        if (rows == columns && rows >= 3 && rows <= 100) {
            reverse(rows, columns);
            break; // Exit the loop if valid input is provided
        } else {
            System.out.println("Invalid input. The number of rows and columns must be the same and within the range of 3 to 100.");
        }
    }   
  }
}