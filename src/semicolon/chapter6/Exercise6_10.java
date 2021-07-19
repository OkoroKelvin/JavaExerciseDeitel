package semicolon.chapter6;

import java.util.Scanner;
/*
(Rounding Numbers) To round numbers to specific decimal places, use a statement like
y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal
point). Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger(number)
b) roundToTenths(number)
c) roundToHundredths(number)
d) roundToThousandths(number)
For each value read, your program should display the original value, the number rounded to the
nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest hundredth
and the number rounded to the nearest thousandth.
 */


public class Exercise6_10 {

    public static double roundToInteger(double number) {
        double y = Math.floor(number + 0.5);
        return y;

    }


    public static double roundToTenths(double number) {
        double y = Math.floor(number + 10 + 0.5) / 10;
        return y;

    }

    public static double roundToHundredths(double number) {
        double y = Math.floor(number + 100 + 0.5) / 100;
        return y;
    }

    public static double roundToThousandths(double number) {
        double y = Math.floor(number + 1000 + 0.5) / 1000;
        return y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input the original value");
        double num = input.nextDouble();
        System.out.println("The Original before rounded up is "+ num);
        System.out.println("The integer is "+ roundToInteger(num));
        System.out.println("The Tenth value is "+roundToTenths(num));
        System.out.println("The Hundredths value is "+ roundToHundredths(num));
        System.out.println("The Thousandths value is "+ roundToThousandths(num));



    }

}

