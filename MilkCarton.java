
import java.util.Scanner;
public class MilkCarton {

    public static void main(String[] args) {
        double milkCartonLiters = 3.78;
        double costMilkCarton = 0.38;
        double profitMilkCarton = 0.27;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total amount of milk produced in the morning: ");
        double totalAmountofMilk = input.nextDouble();

        double milkCartonContainer = totalAmountofMilk / milkCartonLiters;
        double totalCost = costMilkCarton * totalAmountofMilk;
        double totalProfit = profitMilkCarton * totalAmountofMilk;

        System.out.printf("The number of milk cartons needed to hold milk is %.2f%n", milkCartonContainer);
        System.out.printf("The cost of producing milk is %.2f%n", totalCost);
        System.out.printf("The profit for producing milk is %.2f%n", totalProfit);

        input.close();

    }
    
}
