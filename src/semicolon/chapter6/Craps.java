package semicolon.chapter6;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    ;
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN://win with 7 on first roll
            case YO_LEVEN://win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:// lose with 2 on first roll
            case TREY:// lose with 3 on first roll
            case BOX_CARS://lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default:// did not win or lose, so remember point
                gameStatus = Status.CONTINUE;//game is not over
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        //while game is not complete
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();//roll dice again

            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }
        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
    }

    //roll dice, calculate sum and display results
    public static int rollDice() {
        //pick random die values
        int die1 = 1 + randomNumbers.nextInt(6);//first die roll
        int die2 = 1 + randomNumbers.nextInt(6); //second die roll

        int sum = die1 + die2; //sum of die values

        //display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}

