//Mary deposited her money of 250000php at a bank. The bank gave her 12% for a term
//of 30 days. There is a 10% withholding tax to be deducted from the interest.
//a. Find her withholding tax
//b. Find the net interest, she will receive.
//Use the following formula: I = PRT where, I-interest, P-principal value, R-rate of
//Interest and T-time.
import java.util.Scanner;

public class MoneyDeposit {

    public static void main(String[] args) {

    double deposit;
    double annualRate = 0.12;       
    double time = 30.0/360.0; 
    double interest, withholdingTax, netInterest;

    
    Scanner compute = new Scanner(System.in);

    System.out.print("Enter the amount you want to deposit: ");
    deposit = compute.nextDouble();

    compute.close();

    interest = deposit * annualRate * time;

    withholdingTax = interest * 0.10;

       
    netInterest = interest - withholdingTax;

    System.out.printf("Interest: %.2f%n", interest);
    System.out.printf("Withholding tax: %.2f%n", withholdingTax);
    System.out.printf("Net interest: %.2f%n", netInterest);

        
    }
    
}
