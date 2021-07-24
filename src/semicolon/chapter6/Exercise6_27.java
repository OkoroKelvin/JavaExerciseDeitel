package semicolon.chapter6;

import java.util.Scanner;

public class Exercise6_27 {
    public static String gcd(int number1, int number2) {
        int num3 = Math.min(24, 144);
        String total = "";
        for (int count = 1; count <= num3; count++) {
            int num4 = number1 % count;
            int num5 = number2 % count;
            if (num4 == 0 && num5 == 0) {
                total = +count + "";
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter number 1");
        int number1 = input.nextInt();
        System.out.println("Kindly enter number 2");
        int number2 = input.nextInt();
        System.out.println("The Greatest Common Divisor is : "+gcd(number1, number2));

    }
}
