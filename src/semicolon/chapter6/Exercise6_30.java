package semicolon.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise6_30 {
    public static void main(String[] args) {
        int count = 0;
        String prompt1 = """
                Try again!!!
                
                Kindly guess number between 1 and 1000 and Press -1 to stop guessing
                """;
        String prompt3 = """
                you know the secret!!!
                
                you got lucky!!!
                """;
        System.out.println("Kindly guess number between 1 and 1000");
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        int userGuessNumber = input.nextInt();
        while (userGuessNumber != -1) {
            int guessNumber = 1 + randomNumbers.nextInt(1000);

            if (userGuessNumber == guessNumber) {
                System.out.println("Congratulations. You guessed the number!");
            } else {
                count++;

                System.out.println(prompt1);
            }
            userGuessNumber = input.nextInt();
        }
        if (count <=10){
            System.out.println(prompt3);
        }
        if (count >10){
            System.out.println("You should be able to do better!");
        }


    }


}
