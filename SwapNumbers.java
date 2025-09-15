//Write a program that will accept two numbers and then swap the arrangement of the two
//numbers

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        int number1, number2, temporary;

        Scanner numbers = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = numbers.nextInt();

        System.out.print("Enter the second number: ");
        number2 = numbers.nextInt();

        System.out.println("Before Swapping, number 1 = " + number1 + " and number 2 = " + number2);

        numbers.close();

        temporary = number1;
        number1 = number2;
        number2 = temporary;

        System.out.println("After swapping, number1 = " + number1 + " and number 2 = " + number2);

    } 
}
