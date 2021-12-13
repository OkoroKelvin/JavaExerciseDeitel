package semicolonTest.chapter7.DicesTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.chapter7.Dices.MyDiceRoll;
import semicolon.chapter7.Dices.MyDices;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyDiceRollTest {
    MyDiceRoll diceRoll;


    @BeforeEach
    void setUp() {
        diceRoll = new MyDiceRoll();
    }
    @Test
    void testThatASingleDiceCanBeRolledRandomlyToGiveAFace(){
        SecureRandom random = new SecureRandom();
        int first = 1 + random.nextInt(6);
        MyDices dice = new MyDices();
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
    void testToGetFrequency(){
        int first = 6;
        int second = 3;
        MyDices dice = new MyDices();
        dice.setFace(first);
        diceRoll.setFirstDice(dice);

        MyDices dice2 = new MyDices();
        dice2.setFace(second);
        diceRoll.setSecondDice(dice2);
        diceRoll.setFrequency();
        assertEquals(1,diceRoll.getDiceFaceFrequency()[first + second]);
    }
}