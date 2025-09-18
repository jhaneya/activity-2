import java.util.Scanner;

public class InputProgram {  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the whole numbers");
        System.out.println("separated by one or more spaces:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.printf("You entered %d and %d.%n", number1, number2);

        System.out.println("Next enter two numbers.");
        System.out.println("A decimal point is OK.");
        double decimal1 = input.nextDouble();
        double decimal2 = input.nextDouble();
        System.out.printf("You entered %.2f and %.1f%n", decimal1, decimal2);
        
        System.out.println("Next enter two words:");
        String word1 = input.next();
        String word2 = input.next();
        System.out.printf("You entered \"%s\" and \"%s\"%n", word1, word2);

        System.out.println("Next enter a line of text:");
        input.nextLine(); 
        String lineOfText = input.nextLine();
        System.out.printf("You entered \"%s\"%n", lineOfText);

        input.close();
    }
}
