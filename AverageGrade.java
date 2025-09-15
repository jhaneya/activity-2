// Write a program that will compute the average grade of the student based on the three-
// grading system. Prelim 85, Midterm 93 and Final 87.

import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args) {

        double prelims, midterms, finals, average;
        
        Scanner grades = new Scanner(System.in);

        System.out.print("Enter your Prelims Grade: ");
        prelims = grades.nextDouble();

        System.out.print("Enter your Midterms Grade: ");
        midterms = grades.nextDouble();

        System.out.print("Enter your Finals Grade: ");
        finals = grades.nextDouble();

        grades.close();

        average = (prelims + midterms + finals) / 3;
        System.out.printf("Your average grade is: %.2f%n", average);
    }
    
}
