/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magadan;
import java.util.Scanner;
/**
 *
 * @author mARC
 */
public class mEqualOccurenceCounter {
    static Scanner scanner = new Scanner(System.in);
    
     // This method takes care of inputting arrays and comparing them.
    private static void comp(int x, int y) {
        // Creates a 3D array to store two matrices.
        int[][][] m = new int[2][x][y];
        
        // Prompts the user to enter elements for the first array.
        System.out.println("Enter the Elements of the first array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                m[0][i][j] = scanner.nextInt();
            }
        }
        
        // Prompts the user to enter elements for the second array.
        System.out.println("Enter the Elements of the second array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                m[1][i][j] = scanner.nextInt();
            }
        }
        
        // Calls the 'compareInnerArrays' method to count equal occurrences.
        int compareInn = compareInnerArrays(m[0], m[1]);
        
        // Displays the number of equal occurrences between the two matrices.
        System.out.println("Number of equal occurrences between the two matrices: " + compareInn);
    }
        

        // This method compares the inner arrays element by element.
    private static int compareInnerArrays(int[][] arr1, int[][] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
     
      // This is the main method of the program.
    public static void main(String[] args) {
        int rows, columns;
        
        // Prompts the user to enter the number of rows.
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        
        // Prompts the user to enter the number of columns.
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        
        // Calling the 'lop' method to handle array input and comparison.
        comp(rows, columns);
    }
}
