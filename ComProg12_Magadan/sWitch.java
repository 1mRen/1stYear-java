import java.util.Scanner;

class sWitch{
   public static void main(String[] args){
   Scanner obj = new Scanner(System.in);
   double grade;
   
   System.out.println("Convertion of number grade to letter");

   
   System.out.print("Enter your grade between 1.0 to 5.0: ");
   grade = obj.nextDouble();
   
   
   char letter;

    if (grade < 1.0 || grade > 5.0) {
        System.out.println("The grade you inputed is invalid!");
    } else {
        switch ((int) grade) {
            case 1:
                if (grade >= 1.0 && grade <= 1.5)
                    letter = 'A';
                else
                    letter = 'F';
                break;
            case 2:
                if (grade >= 1.6 && grade <= 2.0)
                    letter = 'B';
                else if (grade >= 2.1 && grade <= 2.5)
                    letter = 'C';
                else
                    letter = 'F';
                break;
            case 3:
                if (grade >= 2.6 && grade <= 3.0)
                    letter = 'D';
                else
                    letter = 'F';
                break;
            default:
                letter = 'F';
                break;
        }
        System.out.println("The letter equivalent to your grade is, " + letter);
    }
}
}              
      
      

              


 