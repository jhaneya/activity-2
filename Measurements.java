//Write a program that will accept a measurement in inches, then output the equivalent in Feet
//and Centimeters.

import java.util.Scanner;

public class Measurements {

    public static void main(String[] args) {

        double inches;
        double feet = 12;
        double centimeters = 2.54;
        double equivalentToFeet;
        double equivalentToCentimeters;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter measurements in inches (inch): ");
        inches = input.nextDouble();

        input.close();

        equivalentToFeet = inches / feet;
        equivalentToCentimeters = inches * centimeters;

        System.out.printf("Equivalent to feet (ft) is: %.2f%n", equivalentToFeet);
        System.out.printf("Equivalent to Centimeter (cm) is: %.2f%n", equivalentToCentimeters);
}
    
}
