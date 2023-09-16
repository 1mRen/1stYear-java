/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magadan;
import java.util.Scanner;
/**
 *
 * Marc Lawrence C. Magadan
 */
public class Magadan {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int qty, option, prod;
        char y;
        
        
        System.out.println("Welcome to the Pizza Shop!");
        do{
        System.out.println("============================");
        System.out.println("Choose your option");
        System.out.println("1. Deluxe Pizza = P185\n2. Special Pizza = P250\n3. Promo Pizza = P290");
        System.out.println("============================");
        option = scanner.nextInt();
        System.out.println("============================");
        
        switch(option){
            case 1:
                System.out.print("How many? ");
                qty = scanner.nextInt();
                prod = qty * 185;
                System.out.printf("Total: P%d\n", prod);
                break;
            case 2: 
                System.out.print("How many? ");
                qty = scanner.nextInt();
                prod = qty * 250;
                System.out.printf("Total: P%d\n", prod);
                break;
            case 3: 
                System.out.print("How many? ");
                qty = scanner.nextInt();
                if(qty == 2){
                prod = (qty * 290) - 200;
                System.out.printf("Total: P%d\n", prod);
                }
                else{prod = qty * 290;
                System.out.printf("Total: P%d\n", prod);
                break; 
        }
    }
        System.out.print("Do you want to buy again(y / press any other keys to quit)? ");
        y = scanner.next().charAt(0);
        }
        while(y == 'Y' || y == 'y');
        
        System.out.print("Thank you for buying!");
   }
}
