package semicolon.chapter6;

import java.util.Scanner;

public class Exercise6_9 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter value to be rounded: ");
        double x = input.nextDouble();

        double y = Math.floor(x + 0.5);

        System.out.printf("Original value is: %f%n", x);
        System.out.printf("Rounded value is: %f", y);

    }
}
