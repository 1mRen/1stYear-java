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
public class crimeOccurence {
    static Scanner scanner = new Scanner(System.in);
    
    private static void analyze(int y, int n){  // Function to input the matrix of crimes, count occurrences, and find the most severe crime
        
        int [][] m = new int [y][n];    // Create a 2D array to store the matrix of crimes
        
        System.out.println("Enter the crimes that occured: ");      // Input the matrix of crimes
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        
         int mostSevereCrime = m[0][0];     // Initialize variables to keep track of the most severe crime
        int maxFrequency = 0;           

        int temp = count(m,  y, n,mostSevereCrime, maxFrequency);      // Call the count function to count occurrences and find the most severe crime
        
        System.out.println("Most severe crime = " + temp);  // Output the most severe crime
    }
    
    private static int count(int [][]x, int y, int q,int mS, int mF){        // Function to count occurrences of each crime and find the most severe crime
        
        for (int i = 0; i < y; i++) {   // Count the occurrences of each crime and find the most severe crime
            for (int j = 0; j < q; j++) {
                int currentCrime = x[i][j];
                int currentFrequency = 0;

                
                for (int a = 0; a < y; a++) {   // Count the frequency of the current crime in the matrix
                    for (int b = 0; b < q; b++) {
                        if (x[a][b] == currentCrime) {
                            currentFrequency++;
                        }
                    }
                }
                if (currentFrequency > mF || (currentFrequency == mF && currentCrime > mS)) {   // Update most severe crime
                    mS = currentCrime;
                    mF = currentFrequency;
                }
            }
        }
        return mS;
    }
    
    public static void main(String[] args){
        int rows, columns;
        
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        
        analyze(rows, columns);  // Call the analyzeMatrix function to perform the analysis
    }
}