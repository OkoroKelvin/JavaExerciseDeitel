package africa.semicolon.tddClass;
import java.util.Scanner;
/*
Ask and Get Scores from users
If the score is 90 and above, Show its A
if the score is between 80 to 89, Show its B
if the score is between 70 to 79, Show its C
if the score is 60 to 69, Show its D
if the score is 59 below , Show its F
*/

public class SchoolScore {
    public static void main (String...args){

        int marks;
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly Enter Your Score");
        marks= input.nextInt();

        if (marks >= 90){
            System.out.println("You got A");
        }
        if (marks >=80 && marks <=89){
            System.out.println("You got B");
        }
        if (marks >= 70 && marks <=79){
            System.out.println("You got C");
        }
        if (marks >=60 && marks <=69){
            System.out.println("You got D");
        }
        if (marks <=59){
            System.out.println("You got F");
        }

    }
}
