//Mary deposited her money of 250000php at a bank. The bank gave her 12% for a term
//of 30 days. There is a 10% withholding tax to be deducted from the interest.
//a. Find her withholding tax
//b. Find the net interest, she will receive.
//Use the following formula: I = PRT where, I-interest, P-principal value, R-rate of
//Interest and T-time.

public class MoneyDeposit {
    public static void main(String[] args) {

    double principalValue = 250000;
    double annualRate = 0.12;       
    double time = 30.0/360.0; 
    double interest, withHoldingTax, netInterest;

    interest = principalValue * annualRate * time;
    withHoldingTax = interest * 0.10; 
    netInterest = interest - withHoldingTax;

    System.out.println("Mary's deposit is: " + principalValue + " Php");
    System.out.printf("Interest: %.2f Php%n", interest);
    System.out.printf("Withholding tax: %.2f Php%n", withHoldingTax);
    System.out.printf("Net interest: %.2f Php%n", netInterest);

    }
}

