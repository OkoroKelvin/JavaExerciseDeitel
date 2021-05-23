package africa.semicolon.tddClass;
/*
Ask and Get Scores from users
If the score is 90 and above, Show its A
if the score is between 80 to 89, Show its B
if the score is between 70 to 79, Show its C
if the score is 60 to 69, Show its D
if the score is 59 below , Show its F
*/
import java.util.Scanner;
public class SchoolScore2 {

    public static void main(String...args) {
        int scoreNum;

        Scanner input = new Scanner(System.in);
        System.out.println("Kindly Enter Your Number: ");
        scoreNum = input.nextInt();

        if (scoreNum >= 90) {
            System.out.println("You got A");
        } else if (scoreNum >= 80 && scoreNum <= 89) {
            System.out.println("You got B");
        } else if (scoreNum >= 70 && scoreNum <= 79) {
            System.out.println("You got C");
        } else if (scoreNum >= 60 && scoreNum <= 69) {
            System.out.println("You got D");
        } else if (scoreNum <= 59) {
            System.out.println("You got F");
        }

    }
}
