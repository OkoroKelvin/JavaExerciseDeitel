package semicolon.chapter6;

import java.util.Scanner;

public class CreditCardNumberValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input Card Number");
        //String cardNumber = input.next();
        //long newCardNumber = Long.parseLong(cardNumber);
        long newCardNumber = input.nextLong();
        System.out.println(sumOfDoubleEvenPlace(newCardNumber));


    }

    public static int sumOfDoubleEvenPlace(long newCardNumber) {
        // System.out.println(cardNumber.length());
        String cardNumber = Long.toString(newCardNumber);
        long divisor = (long) Math.pow(10, cardNumber.length() - 1);
        int digit;
        int totalA = 0;
        int totalB = 0;
        while (divisor > 0) {
            digit = (int) (newCardNumber / divisor % 10L);
            int newDigit = digit * 2;
            if (newDigit > 9) {
                int savedNumber = newDigit / 10;
                int savedNumber2 = newDigit % 10;
                int sum = savedNumber + savedNumber2;
                System.out.println("sum"+sum);
                System.out.println(totalA = +sum);
            }
            if (newDigit <= 9) {
                System.out.println("newDigit"+newDigit);
                System.out.println("Sum"+(totalB = +newDigit));
            }
            divisor /= 100;
        }
        return totalA + totalB;
    }
}


