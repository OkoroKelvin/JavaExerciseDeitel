package OOP.chapterSeven.GameOfCraps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameDiceRollTest {
GameDiceRoll diceRoll;
    @BeforeEach
    void setUp() {
       diceRoll  = new GameDiceRoll();
    }
    @Test
    void testThatASingleDiceCanBeRolledRandomlyToGiveAFace(){
        SecureRandom random = new SecureRandom();
        int first = 1 + random.nextInt(6);
        GameDice dice = new GameDice();
        dice.setFace(first);
        diceRoll.setFirstDice(dice);

        assertTrue(diceRoll.getFirstDice().getFace() > 0
                &&
                diceRoll.getFirstDice().getFace() < 7);

        int second = 1 + random.nextInt(6);
        dice.setFace(second);
        diceRoll.setSecondDice(dice);

        assertTrue(diceRoll.getSecondDice().getFace() > 0
                &&
                diceRoll.getSecondDice().getFace() < 7);
    }
    @Test
    void testToGetTheSumOfDies(){
        int first = 6;
        int second = 3;
        GameDice dice = new GameDice();
        dice.setFace(first);
        diceRoll.setFirstDice(dice);

        GameDice dice2 = new GameDice();
        dice2.setFace(second);
        diceRoll.setSecondDice(dice2);
        diceRoll.getSumOfDices();
        assertEquals(9,diceRoll.getSumOfDices());

    }

    @Test
    void testToGetFrequency(){
        int first = 6;
        int second = 3;
        GameDice dice = new GameDice();
        dice.setFace(first);
        diceRoll.setFirstDice(dice);

        GameDice dice2 = new GameDice();
        dice2.setFace(second);
        diceRoll.setSecondDice(dice2);
        diceRoll.setFrequency();
        assertEquals(1,diceRoll.getDiceFaceFrequency()[first + second]);
    }
}