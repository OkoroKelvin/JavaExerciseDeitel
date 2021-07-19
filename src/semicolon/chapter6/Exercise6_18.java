package semicolon.chapter6;

import java.util.Scanner;

public class Exercise6_18 {
    public static void squareOfAsterisks(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int star = input.nextInt();
        squareOfAsterisks(star);

    }
}
