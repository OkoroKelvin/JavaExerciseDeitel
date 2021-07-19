package semicolon.chapter6;
/*
Declare method sphereVolume to calculate and return the volume of the sphere. Use the
following statement to calculate the volume:
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
Write a Java application that prompts the user for the double radius of a sphere, calls sphereVolume
to calculate the volume and displays the result.
 */

import java.util.Scanner;

public class Exercise6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input your radius value");
        double radius = input.nextDouble();
        System.out.printf("The volume of the sphere is %.2f%n ", + sphereVolume(radius));
    }



    public static double sphereVolume(double myRadius){
        double volume = (4.0/3.0)* Math.PI * Math.pow(myRadius,3);


        return volume;
    }

}
