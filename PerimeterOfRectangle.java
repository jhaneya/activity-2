// Write a program that will compute and display the area and perimeter of a rectangle.
// Formula: area = length * width and perimeter = 2(length + width)
import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {

        double length, width;
        double area, perimeter;
        
        Scanner compute = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = compute.nextDouble();

        System.out.print("Enter the Width: ");
        width = compute.nextDouble();

        compute.close();

        area = length * width;
        perimeter = 2 * (length * width) ;
        
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
         
    }
    
}
