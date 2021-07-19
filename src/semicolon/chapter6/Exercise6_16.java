package semicolon.chapter6;

import java.util.Scanner;

public class Exercise6_16 {
    public static boolean isMultiple (int first, int second) {
        int multiple = first % second;


        if (multiple == 0) {
            return true;
        } else

            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt = """
                Welcome to the application  that determines 
                multiples of number between two integers
                
                Kindly input the amount of series of pairs of integers
                """;

        System.out.println(prompt);
        int series = input.nextInt();

        for(int i = 1; i <= series; i++){
            System.out.println("Kindly input for series "+i);
            System.out.println("Kindly input first number: ");
            int firstNumber = input.nextInt();
            System.out.println("Kindly input second number: ");
            int secondNumber = input.nextInt();

            System.out.println("For series "+i+", is Second number a multiple of the first number? "+ isMultiple(firstNumber,secondNumber));
        }


    }

}
