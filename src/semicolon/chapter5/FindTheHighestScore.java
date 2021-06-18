package semicolon.chapter5;

import java.util.Scanner;

public class FindTheHighestScore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String studentName;
        int numberOfStudent;
        int studentScore=0;
        int count=1;
        int highestScore = 0;
        String highestStudentName = null;

        System.out.println("Kindly enter the student number");
        numberOfStudent=input.nextInt();

        while(count <= numberOfStudent){
            System.out.println("Kindly enter the student name");
            studentName=input.next();
            System.out.println("Kindly enter the student score");
            studentScore=input.nextInt();

            if(studentScore > highestScore){
                highestStudentName = studentName;
                highestScore = studentScore;

            }
            count++;
        }
        System.out.println("The name of student with the highest score is: "+highestStudentName);
    }
}
