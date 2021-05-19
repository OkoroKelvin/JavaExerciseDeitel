package africa.semicolon.tddClass;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ScoreSheet {
    public static void main(String...args){
        int score;

        Scanner input = new Scanner(System.in);
        System.out.println("Kindly Enter Score: ");
        score = input.nextInt();

        if (score >= 60){
            System.out.println("Passed");
        }

        if(score<60){
            System.out.println("Failed");
        }

    }
}
