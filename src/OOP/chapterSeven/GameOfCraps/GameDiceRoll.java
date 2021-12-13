package OOP.chapterSeven.GameOfCraps;

public class GameDiceRoll {
    private GameDice firstDice;
    private GameDice secondDice;
    private int[] diceFaceFrequency = new int[13];

    public void setFirstDice(GameDice firstDice) {
        this.firstDice = firstDice;
    }

    public GameDice getFirstDice() {
        return firstDice;
    }

    public void setSecondDice(GameDice secondDice) {
        this.secondDice = secondDice;
    }

    public GameDice getSecondDice() {
        return secondDice;
    }

    public int getSumOfDices() {
        int sum = firstDice.getFace() + secondDice.getFace();
        return sum;
    }

    public void setFrequency() {
        ++diceFaceFrequency[firstDice.getFace() + secondDice.getFace()];
    }

    public int[] getDiceFaceFrequency() {
        return diceFaceFrequency;
    }
}