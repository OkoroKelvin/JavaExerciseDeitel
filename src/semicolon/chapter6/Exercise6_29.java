package semicolon.chapter6;

import java.security.SecureRandom;
enum Coin{
    HEAD, TAIL}
public class Exercise6_29 {

    public static void tossCoin() {
        SecureRandom randomNumbers = new SecureRandom();
        int face = randomNumbers.nextInt();
        int coinUp = 0;
        int coinDown = 0;
        if (face == 1) {
            coinUp++;
        } else {
            coinDown++;
        }

    }

    public static void main(String[] args) {
        tossCoin();
    }

    public static Coin flip() {
        SecureRandom randomNumbers = new SecureRandom();
        int value = 1 + randomNumbers.nextInt(2);
        Coin side;

        if (value == 1) {
            side = Coin.HEAD;
        } else
            side = Coin.TAIL;

        return side;
    }
}

