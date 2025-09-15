// Write a program that will compute the average grade of the student based on the three-
// grading system. Prelim 85, Midterm 93 and Final 87.
public class AverageGrade {

    public static void main(String[] args) {

        double prelims = 85;
        double midterms = 93;
        double finals = 87;
        double average;
    
        average = (prelims + midterms + finals) / 3;

        System.out.println("Your Prelims Grade is: " + prelims);
        System.out.println("Your Midterms Grade is: " + midterms);
        System.out.println("Your Finals Grade is: " + finals);

        System.out.printf("Your average grade is: %.2f%n", average);
    }
    
}
