//
import java.util.Scanner;

public class NumberOfEggs {

    public static void main(String[] args) {

        int numOfEggs;
        int numOfBasket;
        int totalEggs;
        int newBasket;
        int takenEggs;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of eggs in the basket: ");
        numOfEggs = input.nextInt();

        System.out.println("Enter the number of baskets: ");
        numOfBasket = input.nextInt();

        totalEggs = numOfEggs * numOfBasket;

        System.out.println("If you have");
        System.out.println(numOfEggs + " eggs per basket and");
        System.out.println(numOfBasket + " baskets, then");
        System.out.println("The total number of eggs is " + totalEggs);
        System.out.println("Now we take two eggs out of each basket.");
        System.out.println("Now you have");

        takenEggs = numOfEggs - 2;
        newBasket = takenEggs * numOfBasket;
        
        System.out.println( newBasket + " eggs per basket and");
        System.out.println(numOfBasket + " baskets");
        System.out.println("The new total number of eggs is " + newBasket + ".");
        System.out.println();
        System.out.println("Thank you!");
        
        input.close();

    }
    
}
