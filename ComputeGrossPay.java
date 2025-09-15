// Write a program to compute the gross pay of a worker name Juan Dela Cruz given that
// juan Dela Cruz worked for 40 hours at the rate of 215.75.

import java.util.Scanner;

public class ComputeGrossPay {
    
    public static void main(String[] args) {
        
        String name;
        int workingHours;
        double ratePerHour = 215.75;
        double grossPay;


        Scanner salary = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = salary.nextLine();

        System.out.print("Enter your working hours: ");
        workingHours = salary.nextInt();

        salary.close();

        grossPay = workingHours * ratePerHour;
        System.out.println("The total Gross pay of " + name + " is " + grossPay + " for working " + workingHours + " hours.");

    }
}
