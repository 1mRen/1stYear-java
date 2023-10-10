/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author VV702
 */

public class magadanBalancedBracket {
    static Scanner scanner = new Scanner(System.in);
   
    public static boolean isBalanced(String x) {
        int num = x.length();
        char[] stack = new char[num];
        int top = -1;

        for (int i = 0; i < num; i++) {
            char ch = x.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack[++top] = ch;
                    break;
                case ')':
                    if (top == -1 || stack[top] != '(') {
                        return false;
                    }           top--;
                    break;
                case ']':
                    if (top == -1 || stack[top] != '[') {
                        return false;
                    }           top--;
                    break;
                case '}':
                    if (top == -1 || stack[top] != '{') {
                        return false;
                    }           top--;
                    break;
                default:
                    break;
            }
    }

        return top == -1;
}
    
    public static void main(String[] args) {
        
        System.out.print("Enter a string: ");
        String user = scanner.nextLine();

        if (isBalanced(user)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}