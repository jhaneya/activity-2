//Write a program to calculate the volume of a sphere. Then display the result. Use the
// following formula: vsphere = 4/3 π r3

import java.util.Scanner;

public class VolumeOfSphere {

    public static void main(String[] args) {
        
    double radius;
    double result;
    double pi = 3.14159;

    Scanner volume = new Scanner(System.in);

    System.out.print("Enter a radius: ");
    radius = volume.nextDouble();

    volume.close();

    result = (4.0 / 3.0) * pi * radius * radius * radius;

    System.out.printf("The volume of the sphere with radius %.2f is: %.2f%n", radius, result);

    }

}