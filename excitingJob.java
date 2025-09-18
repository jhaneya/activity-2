import java.util.Scanner;

public class excitingJob {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double taxRate = 0.14;
        double clothesRate = 0.10;
        double suppliesRate = 0.01;
        double savingsBond = 0.25;
        double additionalBond = 0.50;

        System.out.print("Enter your pay rate for an hour: ");
        double payRate = input.nextDouble();

        System.out.print("Enter the number of hours you worked each week: ");
        double numberOfHours = input.nextDouble();

        Double income = (payRate * numberOfHours) * 5;
        System.out.printf("Your income before taxes from your summer job is %.2f%n", income);

        double incomeAfterTax = income * (1 - taxRate);
        System.out.printf("Your income after taxes from your summer job is %.2f%n", incomeAfterTax);

        double totalClothesCost = incomeAfterTax * clothesRate;
        System.out.printf("The money you spend on clothes and other accessories is %.2f%n", totalClothesCost);

        double totalSuppliesCost = incomeAfterTax * suppliesRate;
        System.out.printf("The money you spend on school supplies %.2f%n", totalSuppliesCost);

        double remaining = incomeAfterTax - totalClothesCost - totalSuppliesCost;

        double mySavingsBonds = remaining * savingsBond;
        double parentsBonds = mySavingsBonds * additionalBond;

        System.out.printf("Money spent on savings bonds: $%.2f%n", mySavingsBonds);
        System.out.printf("Money your parents spend on additional savings bonds: $%.2f%n", parentsBonds);

        input.close();

    }
}
