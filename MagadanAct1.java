
package magadanact1;

import java.util.Scanner;
// Marc Lawrence C. Magadan     BSIT - 2

public class MagadanAct1 {

    //main method
    public static void main(String[] args) {
        //Declaring scanner
        Scanner obj = new Scanner(System.in);
      //asking for the size to the user
      System.out.print("Enter the size of the first array: ");
      int a = obj.nextInt();
      int [] array = new int[a] ;
      
      //compiling the elements into the array
      System.out.println("Enter elements of the first array: ");
         for(int i=0;i<a;i++){
            array[i]=obj.nextInt();   
      }
      
      //asking for the size to the user
      System.out.print("Enter the size of the second array: ");
      int b = obj.nextInt();
      int [] array2 = new int[b] ;
      
      System.out.println("Enter elements of the second array: ");
         for(int i=0;i<b;i++){
            array2[i]=obj.nextInt();   
      }
      // sum and product 
      int sum = array[0] + array2[array2.length-1];
      int prod = array[1] * array2[array2.length-2];
      
      System.out.printf("The sum of first and last: %d", sum);
      System.out.printf("\nThe product of second and second to the last: %d", prod);

    }
    
}
