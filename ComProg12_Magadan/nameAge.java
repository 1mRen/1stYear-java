import java.util.Scanner;

class nameAge{

   public static void main(String[] args){
   
      Scanner obj = new Scanner(System.in);
      
      System.out.println("==========================");
      System.out.println("What's your name? ");
      String name = obj.nextLine();
      
      System.out.println("What's your occupation?");
      String occ = obj.nextLine();
      
      System.out.println("How old are you? ");
      int age = obj.nextInt();
    
      System.out.println("==========================");
      
      System.out.print("I see, so you are "+ name + " with an age of " + age + " year old" + ". Who's currently a " + occ);
      System.out.println("Nice!");
      
      
      //Marc Lawrence C. Magadan BSIT - 1B
   }

}