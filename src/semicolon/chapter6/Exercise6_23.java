package semicolon.chapter6;

import java.util.Scanner;

/*
(Find the Minimum) Write a method minimum3 that returns the smallest of three floatingpoint
numbers. Use the Math.min method to implement minimum3. Incorporate the method into an
application that reads three values from the user, determines the smallest value and displays the result.
 */
public class Exercise6_23 {
    public static float minimum3(float num1, float num2, float num3){
        float minNumber = Math.min(num1,Math.min(num2,num3));
        return minNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input your number 1");
        float num1 = input.nextFloat();
        System.out.println("Kindly input your number 2");
        float num2 = input.nextFloat();
        System.out.println("Kindly input your number 3");
        float num3 = input.nextFloat();
        System.out.println("The Minimum number is " + minimum3(num1,num2,num3));
    }
}
