package semicolon.chapter7.exercise7_11;

public class ArrayBestScore {
    public static void main(String[] args) {

        int[] bestScore = new int [5];
        System.out.printf("%s: ","Best scores");
        for(int count = 0; count < bestScore.length; count++) {
            bestScore[count] = count + 5;
            System.out.printf("%d   ", bestScore[count]);
        }
    }
}
