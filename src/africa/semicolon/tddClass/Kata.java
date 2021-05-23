package africa.semicolon.tddClass;
import java.util.Scanner;

public class Kata {
    private String grade;
    public static void main(String... args) {
        int num1;
        System.out.println("kindly input three numbers");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        int newNum1 = num1 / 100;
        int newNum2 = (num1 / 10) % 10;
        int newNum3 = (num1 % 10);


        if (newNum1 == newNum3) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }

    public String showGrade(int score){
        if (score>=90){
            grade="A";
        }
        else
            if(score>=80 && score<=89){
                grade="B";
            }
        else
            if(score>=70 && score<=79){
                grade="C";
            }
        else
            if(score>=60 && score<=69){
                grade="D";
            }
        else
            if(score>=40 && score<=59){
                grade="E";
            }
        else
            if(score<=39){
                grade="F";
            }
        return grade;
    }



}