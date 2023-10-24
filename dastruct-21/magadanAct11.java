/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author VV702
 */
public class magadanAct11 {
    static Scanner scanner = new Scanner(System.in);
    
     public static void main(String[] args) {

        System.out.print("Enter the size of queue 1: ");
        int s1 = scanner.nextInt();
        int[] q1 = new int[s1];
        System.out.print("Enter " + s1 + " integers to add to queue 1: ");
        for (int i = 0; i < s1; i++) {
            q1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of queue 2: ");
        int s2 = scanner.nextInt();
        int[] q2 = new int[s2];
        System.out.print("Enter " + s2 + " integers to add to queue 2: ");
        for (int i = 0; i < s2; i++) {
            q2[i] = scanner.nextInt();
        }
        
        int[] intersect = new int[s1];
        int intersectSize = 0;
        int i = 0, j = 0;
        while (i < s1 && j < s2) {
            if (q1[i] == q2[j]) {
                intersect[intersectSize] = q1[i];
                intersectSize++;
                i++;
                j++;
            } else if (q1[i] < q2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.print("The intersection of the two arrays is: ");
        for (int k = 0; k < intersectSize; k++) {
            System.out.print(intersect[k] + " ");
        }
    }
}