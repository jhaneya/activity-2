// Write a program that will compute the sum and product of two input numbers.
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int number1;
        int number2;
        int sum;
        int product;
        
        Scanner calcu = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number1 = calcu.nextInt();

        System.out.print("Enter another number: ");
        number2 = calcu.nextInt();

        calcu.close();

        sum = number1 + number2;

        product = number1 * number2;

        System.out.println("The sum of two numbers is: " + sum);
        System.out.println("The product of two numbers is: " + product);

    }
    
}
