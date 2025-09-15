//Write a program that will compute and output the time required to travel 5400 miles at a
//speed of 220 mph.
public class TravelTime {

    public static void main(String[] args) {

        double speed = 220;
        double miles = 5400;
        double time;

       
        time = miles / speed;

        System.out.printf("When traveling %.0f miles at the speed of %.0f mph, you need %.2f hours.%n",
                          miles, speed, time);
        
    }
    
}
