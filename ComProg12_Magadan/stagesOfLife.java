import java.util.Scanner;
class stagesOfLife{

   public static void main(String[] args){
   Scanner obj = new Scanner(System.in);
   int age;
   
   System.out.print("Enter your Age: ");
   age = obj.nextInt();
   
   if(age <= 1 && age >= 0){
   System.out.print("Infant");
   }
   
   else if(age <= 4 && age>= 2){
   System.out.print("Toddler");
   }
   
   else if(age <= 12 && age>= 5){
   System.out.print("Child");
   }
   
   else if(age <= 19 && age>=13){
   System.out.print("Teen");
   }
   
   else if(age <= 39 && age>= 20){
   System.out.print("Adult");
   }
   
   else if(age <= 59 && age>= 40){
   System.out.print("Middle Age Adult");
   }
   
   else if(age >= 60){
   System.out.print("Senior Adult");
   }

   else{
      System.out.print("Invalid Age ");
   }
   
// Marc Lawrence C. Magadan

   }
}
