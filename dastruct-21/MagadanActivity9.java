/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VV702
 */

import java.util.*;

public class MagadanActivity9 {
    static Scanner scanner = new Scanner(System.in);
    
    static void fDTriplets(int[] arr) {
        System.out.print("Triplicates found: ");
        boolean found = false;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 2]) {
                if (i > 0 && arr[i] == arr[i - 1]) {
                    continue;
                }
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No triplicates found. ");
        } else {
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        fDTriplets(arr);
    }
}