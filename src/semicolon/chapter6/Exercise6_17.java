package semicolon.chapter6;

import java.util.Scanner;

/*
(Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
whether an integer is even. The method should take an integer argument and return true if the integer
is even and false otherwise. Incorporate this method into an application that inputs a sequence
of integers (one at a time) and determines whether each is even or odd.
 */
public class Exercise6_17 {
    public static boolean isEven(int number){
        int evenOrOdd = number % 2;
        if (evenOrOdd == 0){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String format = """
                Welcome to QuartApp, which helps you know
                if a number is Even or Odd
                
                If result shows True, it is an Even number, if False,
                it is an Odd number.
                """;

        System.out.println(format);
        System.out.println("Kindly Input the number that you want to know about");

        int num = input.nextInt();
        System.out.println("Is "+num+" an Even or Odd Number ? "+ isEven(num));
    }
}
