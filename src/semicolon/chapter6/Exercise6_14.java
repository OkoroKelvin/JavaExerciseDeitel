package semicolon.chapter6;

import java.util.Scanner;

/*
(Exponentiation) Write a method integerPower(base, exponent) that returns the value of
base exponent
For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3). Assume that exponent is a positive,
nonzero integer and that base is an integer. Use a for or while statement to control the calculation.
Do not use any Math class methods. Incorporate this method into an application that reads
integer values for base and exponent and performs the calculation with the integerPower method.
 */
public class Exercise6_14 {
    public static int integerPower(int base, int exponent){
        int newBase=1;
        for(int i = 1; i <= exponent; i++){
            newBase *= base;
        }
        return newBase;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input the base number: ");
        int theBase = input.nextInt();
        System.out.println("Kindly input the exponent number: ");
        int theExponent = input.nextInt();
        System.out.println("The exponent of the inputted number is "+integerPower(theBase,theExponent));


    }
}
