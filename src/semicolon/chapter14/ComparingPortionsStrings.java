package semicolon.chapter14;

import java.util.Scanner;

/*
((Comparing Portions of Strings) Write an application that uses String method regionMatches to compare two strings input by the user.
The application should input the number of characters to be compared and the starting index of the comparison.
 The application should state
whether the strings are equal. Ignore the case of the characters when performing the comparison.

 */
public class ComparingPortionsStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input your Sentences");
        String firstSentence = input.nextLine();
        String secondSentence = input.nextLine();
        if((firstSentence.regionMatches(true,0,secondSentence,0,5)))
        {
            System.out.println("First character of "+firstSentence+" and "+ secondSentence+" match");
        }
        else
            System.out.println("First character of "+firstSentence+" and "+ secondSentence+" do not match");

    }
}
