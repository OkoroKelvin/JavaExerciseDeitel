package semicolon.chapter6;

import java.util.Scanner;

public class Exercise6_19 {
    public static void squareOfAsterisks(int side,char fill) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print(fill);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int star = input.nextInt();
        char fill = input.next().charAt(0);
        squareOfAsterisks(star,fill);

    }
}
