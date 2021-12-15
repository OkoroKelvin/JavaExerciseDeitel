package semicolon.chapter7;

import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        int[]array = new int[13];
        for(int num =1; num <= 36000000; num++) {
            int value = rollDice();
            ++array[value];
        }
        System.out.println("Dice number               appearance");
        for(int count = 2 ; count<=12;count++){

            System.out.println(count+ "                 "+array[count]);
        }
    }
    private static int rollDice(){
        SecureRandom random = new SecureRandom();
        int dice1= 1+ random.nextInt(6);
        int dice2= 1+ random.nextInt(6);
        return dice1 + dice2;
    }

}
