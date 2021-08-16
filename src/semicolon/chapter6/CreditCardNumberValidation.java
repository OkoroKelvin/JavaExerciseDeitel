package semicolon.chapter6;

import java.util.Scanner;

public class CreditCardNumberValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input Card Number");
        long cardNumber = input.nextLong();
        isValid(cardNumber);
    }

    public static int sumOfDoubleEvenPlace(long cardNumber) {
        String stringCardNumber = Long.toString(cardNumber);
        long divisor = (long) Math.pow(10, stringCardNumber.length() - 1);
        int singleCardNumberDigits;
        int totalA = 0;
        int totalB = 0;
        while (divisor > 0) {
            singleCardNumberDigits = (int) (cardNumber / divisor % 10L);
            int newSingleCardNumberDigits = singleCardNumberDigits * 2;
            if (newSingleCardNumberDigits > 9) {
                int savedNumber = newSingleCardNumberDigits / 10;
                int savedNumber2 = newSingleCardNumberDigits % 10;
                int sum = savedNumber + savedNumber2;
                totalA = totalA + sum;
            }
            if (newSingleCardNumberDigits <= 9) {
                totalB = totalB + newSingleCardNumberDigits;
            }
            divisor /= 100;
        }
        return totalA + totalB;
    }

    public static int sumOfOddPlace(long cardNumber) {
        String stringCardNumber = Long.toString(cardNumber);
        long divisor = (long) Math.pow(10, stringCardNumber.length() - 2);
        int digit;
        int totalA = 0;
        while (divisor > 0) {
            digit = (int) (cardNumber / divisor % 10L);
            totalA = totalA + digit;
            divisor /=100;
        }
        return totalA;
    }
    public static boolean isValid(long cardNumber){
        int sumEvenAndOdd= sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber);
        if(sumEvenAndOdd % 10 == 0){
            System.out.println(cardNumber+" is Valid");
        }else if(sumEvenAndOdd % 10 != 0)
            System.out.println(cardNumber+" is invalid");;
        return false;
    }
    
}



