package OOP.chapterSeven.GameOfCraps;

import java.security.SecureRandom;

public class GameOfCrap {
    private GameDice firstDice;
    private GameDice secondDice;
    private Status status = Status.NEW;
    private int points;
    private SecureRandom random = new SecureRandom();
    GameDiceRoll roll = new GameDiceRoll();

    public int rollDice(){
        firstDice.setFace(1 + random.nextInt(6));
        secondDice.setFace(1 + random.nextInt(6));
        roll.setFirstDice(firstDice);
        roll.setSecondDice(secondDice);
        return roll.getSumOfDices();
    }


    public void playGame(){
        int scoreResult = rollDice();
        if(status == Status.NEW){
            points = scoreResult;

        }
    }

    public void setDice1(GameDice dice) {
        firstDice = dice;
    }

    public GameDice getDice1() {
        return firstDice;
    }

    public void setDice2(GameDice secondDice) {
        this.secondDice = secondDice;
    }

//    public int showSumOfDice() {
//        return firstDice
//    }
}
