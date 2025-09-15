//Write a program that will convert the input number in feet to inches

import java.util.Scanner;

public class InchesConverter {

    public static void main(String[] args) {

        double feet, inches;
        
        Scanner convert = new Scanner(System.in);

        System.out.print("Enter a feet (ft): ");
        feet = convert.nextDouble();

        convert.close();

        inches = feet * 12;

        System.out.println(feet + " feet is equal to " + inches + " inches.");

    }
}