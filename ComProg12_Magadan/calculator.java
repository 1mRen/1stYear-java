import java.util.Scanner;

class calculator{

   public static void main(String[] args){
   
      Scanner obj = new Scanner(System.in);
   
      System.out.println("Enter 2 number: ");
      int num1 = obj.nextInt();
      int num2 = obj.nextInt();
      
      int sum = num1 + num2;
      int diff = num1 - num2;
      int prod = num1 * num2;
      int quot = num1 /  num2;
      
      System.out.println("The Sum of " + num1 + " and " + num2 + " is " + sum);
      System.out.println("The Difference of " + num1 + " and " + num2 + " is " + diff);
      System.out.println("The Product of " + num1 + " and " + num2 + " is " + prod);
      System.out.println("The Quotient of " + num1 + " and " + num2 + " is " + quot);
     
      
      
      //Marc Lawrence C. Magadan BSIT - 1B
   }

}