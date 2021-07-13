package africa.semicolon.turtleGraphics;

public class Sketchpad {
    private int[][] floor;
    public Sketchpad(int numbersOfRows, int numberOfColumns) {
        floor = new int[numbersOfRows][numberOfColumns];

    }

    public int[][] getFloor() {
        return floor;
    }
}
