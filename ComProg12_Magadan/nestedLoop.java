import java.util.Scanner;
/* Marc Lawrence C. Magadan/
    BSIT - 1B */
public class nestedLoop {
        public static void main(String[] args) {
            //declaration
            Scanner obj = new Scanner(System.in);
            char yn, eqG;
            int i1;
            double grade, total;
            int numValidGrades = 0;

            System.out.println( "This is a program that calculates and prints the average of several grades entered by the user.");
            //it will loop if the user inputted only 1
            do {
                do {
                    System.out.print("Enter your grades you want to process(must be 2 grades): ");
                    i1 = obj.nextInt();
                }while(i1 == 1);
                System.out.println("Now enter the " + i1 + " grades to be averaged.");
                total = 0;

                //it would loop to a same number if the user inputted a number that exceeded the maximum
                for (int i = 1; i <= i1; i++) {
                    System.out.print("Enter grade #" + i + ": ");
                    grade = obj.nextDouble();
                    if (grade >= 1.0 && grade <= 5.0) {
                        total += grade;
                        numValidGrades++;
                    } else {
                        System.out.println("*** Invalid entry. Grade must be from 1.0 to 5.0 ***");
                        i--;
                    }
                    }

                    //calculation of average
                    double v = Math.round((total / i1) * 10.0) / 10.0;
                    System.out.println("The average of the " + i1 + " grades entered is " + v);

                    //setting the letter corresponding to the average grade
                    if (v >= 1.0 && v <= 1.5) {
                        eqG = 'A';
                        System.out.println("You have got " + eqG + " grade. ");
                    } else if (v >= 1.6 && v <= 2.0) {
                        eqG = 'B';
                        System.out.println("You have got " + eqG + " grade. ");
                    } else if (v >= 2.1 && v <= 2.5) {
                        eqG = 'C';
                        System.out.println("You have got " + eqG + " grade. ");
                    } else if (v >= 2.6 && v <= 3.0) {
                        eqG = 'D';
                        System.out.println("You have got " + eqG + " grade. ");
                    } else if (v >= 3.1 && v <= 5.0) {
                        eqG = 'F';
                        System.out.println("You have got " + eqG + " grade. ");
                    } else {
                        System.out.println("Invalid average entered.");
                    }
                //the program will loop if the user presses y and stops when the user presses any keys
                System.out.println("Do you want to process again? \n(y / any other keys to quit) ");
                yn = obj.next().charAt(0);
            }
            while (yn == 'Y' || yn == 'y');

            System.out.println("Thank you for using the calculator, see you next time! ^ ^");
        }
    }