// Write a program to compute the gross pay of a worker name Juan Dela Cruz given that
// juan Dela Cruz worked for 40 hours at the rate of 215.75.

public class ComputeGrossPay {
    
    public static void main(String[] args) {
        
        int workingHours = 40;
        double ratePerHour = 215.75;
        double grossPay;

        grossPay = workingHours * ratePerHour;

        System.out.println("Name: Juan Dela Cruz");
        System.out.println("The total Gross pay of Juan Dela Cruz is " + grossPay + " for working " + workingHours + " hours.");

    }
}
