//Write a program that will compute and output the time required to travel 5400 miles at a
//speed of 220 mph.

import java.util.Scanner;

public class TravelTime {

    public static void main(String[] args) {

        double speed;
        double miles;
        double time;

        Scanner compute = new Scanner(System.in);

        System.out.print("Enter the Distance (miles): ");
        miles = compute.nextDouble();

        System.out.print("Enter the speed (mph): ");
        speed = compute.nextDouble();

        compute.close();

        time = miles / speed;

        System.out.printf("When traveling %.0f miles at the speed of %.0f mph540, you need %.2f hours.%n",
                          miles, speed, time);
        
    }
    
}
