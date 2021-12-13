package semicolon.chapter7.Dices;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceMainApp {
    public static void main(String[] args) {
        MyDices dice = new MyDices();
        MyDices dice2 = new MyDices();
        SecureRandom random = new SecureRandom();
        MyDiceRoll roll = new MyDiceRoll();
        for (int i = 0; i < 36000000; i++) {
            dice.setFace(1 + random.nextInt(6));
            dice2.setFace(1 + random.nextInt(6));
            roll.setFirstDice(dice);
            roll.setSecondDice(dice2);
            roll.setFrequency();

        }
        System.out.println(Arrays.toString(roll.getDiceFaceFrequency()));
    }
}
