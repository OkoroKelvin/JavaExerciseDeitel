package semicolon.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;
/*
6.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]
6.31 (Guess the Number Modification) Modify the program of Exercise 6.30 to count the number of guesses the player makes. If the number is 10 or fewer, display Either you know the secret
or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
If the player makes more than 10 guesses, display You should be able to do better! Why should it
take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
half of the numbers, then half of the remaining numbers, and so on
 */

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
