package semicolon.chapter14;

import java.util.Scanner;

/*
14.3 (Comparing Strings) Write an application that uses String method compareTo to compare
two strings input by the user. Output whether the first string is less than, equal to or greater than
the second.
 */
public class Exercise14_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input your Sentences");
        String firstSentence = input.nextLine();
        String secondSentence = input.nextLine();
       if(compareString(firstSentence,secondSentence)==0){
           System.out.println(firstSentence+" is equals to "+secondSentence);
       }
        if(compareString(firstSentence,secondSentence)<0){
            System.out.println(firstSentence+" is less than "+secondSentence);
        }
        if(compareString(firstSentence,secondSentence)>0){
            System.out.println(firstSentence+" is greater than "+secondSentence);
        }
    }
    public static int compareString(String firstSentence, String secondSentence){
        return firstSentence.compareTo(secondSentence);
    }
}