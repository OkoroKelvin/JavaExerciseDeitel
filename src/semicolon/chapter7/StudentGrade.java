package semicolon.chapter7;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);


        System.out.println("Enter number of students");
        int numberOfStudent = inputCollector.nextInt();


        System.out.println("Enter number of subjects");
        int numberOfSubjects = inputCollector.nextInt();

        int[][] scores = new int[numberOfStudent][numberOfSubjects];


        for (int student = 0; student < numberOfStudent; student++) {
            int studentNumber = student+1;
            System.out.println("Entering Score for student " + studentNumber);
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                int subjectNumber = subject +1;
                System.out.println("Enter score for subject " + subjectNumber);
                scores[student][subject] = inputCollector.nextInt();
                System.out.println("Entering Score for student " + studentNumber + ", subject " + subjectNumber + " Saved successfully");
            }
            System.out.println("Entering Score for student " + studentNumber + " Saved successfully");
            System.out.println("________________________________________");
            System.out.println();
        }




        for (int student = 0; student < numberOfStudent; student++) {
            int studentNumber = student+1;
            System.out.println("Student " + studentNumber + "Scores");
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                int subjectNumber = subject +1;
                System.out.println("Score for subject " + subjectNumber + " : " + scores[student][subject]);

            }
            System.out.println("________________________________________");
            System.out.println();


        }
        System.out.println("Thanks for your patience");
    }
}

