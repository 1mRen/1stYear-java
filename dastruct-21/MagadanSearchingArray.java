/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magadanact1;
import java.util.*;
/**
 *
 * @author VV702
 */
public class MagadanSearchingArray {
    static Scanner scanner = new Scanner(System.in);

    int[] array;
    int count;
    List<Integer> pN;

    public MagadanSearchingArray() {
        array = new int[100];
        count = 0;
        pN = new ArrayList<>();
    }

    public static boolean primeBol(int num) {
        if (num <= 1 && num >=  100) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MagadanSearchingArray searchingArray = new MagadanSearchingArray();

        for (int i = 0; i < 100; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int input = scanner.nextInt();

            if (input == 0 || searchingArray.count >= 100) {
                break;
            }

            searchingArray.array[searchingArray.count] = input;
            searchingArray.count++;
        }

        int pC = 0;
        for (int i = 0; i < searchingArray.count; i++) {
            if (primeBol(searchingArray.array[i])) {
                searchingArray.pN.add(searchingArray.array[i]);
                pC++;
            }
        }

        System.out.println("Count of prime numbers: " + pC);
        System.out.println("Prime numbers: " + searchingArray.pN);
    }
}
            
        
   
