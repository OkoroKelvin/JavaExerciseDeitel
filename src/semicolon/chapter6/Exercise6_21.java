package semicolon.chapter6;

/*
(Separating Digits) Write methods that accomplish each of the following tasks:
a) Calculate the integer part of the quotient when integer a is divided by integer b.
b) Calculate the integer remainder when integer a is divided by integer b.
c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4 5 6 2
Incorporate the methods into an application that inputs an integer and calls display-
Digits by passing the method the integer entered. Display the results.
 */

import java.util.Scanner;

public class Exercise6_21{
    public static int quotientMethod(int integerA, int integerB){
        int quotient = integerA / integerB;
        return quotient;
    }

    public static int remainderMethod(int integerA, int integerB){
        int remainder = integerA % integerB;
        return remainder;
    }

    public static String printSeparate(int digits){
        String space ="";
        String message = "are you crazy";
        int units;
        if(digits >=1 && digits <=99999){
            while(digits > 0){
                units = remainderMethod(digits,10);
                space =+ units+ " " + space;

                digits = quotientMethod(digits,10);
            }
            return space;
        }

        else
            return message;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digits;
        do {
            System.out.println("Kindly input your Values or press 0 to exit");
            digits = input.nextInt();
            if (digits == 0){
                break;
            }
            if (digits >= 1 && digits <= 99999) {
                System.out.println(printSeparate(digits));
            } else
                System.out.println("you are mad, try again");
        }while(digits != 0);
    }
}
