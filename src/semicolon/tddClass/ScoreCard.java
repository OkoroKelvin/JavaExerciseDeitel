package africa.semicolon.tddClass;
import java.util.Scanner;

public class ScoreCard {

    public static void main(String... args) {

        int scores;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Scores");
        scores = input.nextInt();

        if (scores >= 60) {
            System.out.println("Congratulation you Passed");
        } else {
            System.out.println("Very Sorry, You failed");
        }
    }
}
