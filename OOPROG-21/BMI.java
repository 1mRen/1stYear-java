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
public class BMI {
   static Scanner scanner = new Scanner(System.in);
   
   public static void main(String[] args){
       
       
       double inches, pounds, BMI, kg, m;
       
       
       System.out.println("Test Data");
       
       System.out.print("Input weight in pounds: ");
       pounds = scanner.nextDouble();
       
       System.out.print("Input weight in inches: ");
       inches = scanner.nextDouble();
       
       kg = pounds*0.45359237;
       m = (inches*0.0254)*(inches*0.0254);
       BMI = kg/m;
       
       System.out.printf("Body Mass Index is %.1f",BMI);
       
   }
}
