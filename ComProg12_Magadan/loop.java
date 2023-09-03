import java.util.Scanner;

public class loop {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            String yn = "";
            int numGrades;
            double grade;

            do {
                do {
                    System.out.print("Enter your grades to process(must be 2 grades): ");
                    numGrades = obj.nextInt();
                }while(numGrades == 1);
                System.out.println("Now enter the " + numGrades + " grades to be averaged.");
                double total = 0;

                for (int i = 1; i <= numGrades; i++) {
                    System.out.print("Enter grade #" + i + ": ");
                    grade = obj.nextDouble();
                    total += grade;
                }

                double range = Math.round((total / numGrades) * 10.0) / 10.0;
                System.out.println("The average of the " + numGrades + " grades entered is " + range);


                char equivalentGrade;
                if (range >= 1.0 && range <= 1.5) {
                    equivalentGrade = 'A';
                } else if (range >= 1.6 && range <= 2.0) {
                    equivalentGrade = 'B';
                } else if (range >= 2.1 && range <= 2.5) {
                    equivalentGrade = 'C';
                } else if (range >= 2.6 && range <= 3.0) {
                    equivalentGrade = 'D';
                } else if (range >= 3.1 && range <= 5.0) {
                    equivalentGrade = 'F';
                } else {
                    System.out.println("Invalid average entered.");
                    equivalentGrade = 'X';
                }

                System.out.println("You have got " + equivalentGrade + " grade. ");

                System.out.println("Do you want to process again? \n(y/ any other keys to quit) ");
                yn = obj.next();
            }
            while (yn.equalsIgnoreCase("y"));


        }
    }

