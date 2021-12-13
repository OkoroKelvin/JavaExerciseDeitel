package semicolon.chapter7.Dices;

public class MyDiceRoll {

    private MyDices firstDice;
    private MyDices secondDice;
    private int[] diceFaceFrequency = new int[13];

    public void setFirstDice(MyDices firstDice) {
        this.firstDice = firstDice;
    }

    public MyDices getFirstDice() {
        return firstDice;
    }

    public void setSecondDice(MyDices secondDice) {
        this.secondDice = secondDice;
    }

    public MyDices getSecondDice() {
        return secondDice;
    }

    public void setFrequency() {
        ++diceFaceFrequency[firstDice.getFace() + secondDice.getFace()];
    }

    public int[] getDiceFaceFrequency() {
        return diceFaceFrequency;
    }
}

