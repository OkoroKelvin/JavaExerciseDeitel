package semicolon.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

/*
    Computer-Assisted Instruction) The use of computers in education is referred to as computer-assisted instruction (CAI).
    Write a program that will help an elementary school student learn
    multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new question. This method should be called once when the application begins execution and each time the
user answers the question correctly.
     */
public class Exercise6_35 {
    private static Scanner input = new Scanner(System.in);
    private static SecureRandom randomNumbers = new SecureRandom();
    static int userInput;
    static int randomValue;
    static int randomValue2;
    private static int newRandomValue;

    public static void main(String... args) {

        String prompt = """
                Welcome to the the application of multiplication
                """;
        newQuestions();
    }

    public static void newQuestions() {
        randomValue = 1 + randomNumbers.nextInt(9);
        randomValue2 = 1 + randomNumbers.nextInt(9);
        System.out.println("How much is " + randomValue + " times " + randomValue2 + " ?");
        answerToQuestion(userInput, randomValue * randomValue2);
    }

    public static void answerToQuestion(int userInput, int totalRandomValues) {
        if (userInput == totalRandomValues) {
            System.out.println("Good work!");
            newQuestions();

        } else {
            System.out.println("Try again");
            userInput = input.nextInt();
            answerToQuestion(userInput, randomValue * randomValue2);

        }
    }
}