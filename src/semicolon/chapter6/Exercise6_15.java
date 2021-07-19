package semicolon.chapter6;

import java.util.Scanner;

/*
(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two arguments
of type double and return the hypotenuse as a double. Incorporate this method into an application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]
 */
public class Exercise6_15 {

    public static double hypotenuse(double side1, double side2){

        double result= Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input value of Triangle Side 1");
        double side1 = input.nextDouble();
        System.out.println("Kindly input value of Triangle Side 2");
        double side2 = input.nextDouble();

        System.out.println("The Hypotenuse of the Triangle is: "+ hypotenuse(side1,side2));
    }


}
