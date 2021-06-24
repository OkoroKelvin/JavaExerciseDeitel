package semicolon.chapter7;

import java.util.Scanner;

public class StudentGradeMethod {
    private static Scanner inputCollector = new Scanner(System.in);
    private static int numberOfStudent;
    private static int numberOfSubjects;
    private static int[][] scores;


    public static void main(String[] args) {
        setupApplication();
        collectScore();
        displayScore();
        //System.out.printf("%d,%d,%d", setupApplication(),collectScore(),displayScore());

        System.out.println("Thanks for your patience");
    }


    private static void setupApplication() {
        System.out.println("Enter number of students");
        numberOfStudent = inputCollector.nextInt();


        System.out.println("Enter number of subjects");
        numberOfSubjects = inputCollector.nextInt();

        scores = new int[numberOfStudent][numberOfSubjects];
    }

    private static void collectScore() {
        for (int student = 0; student < numberOfStudent; student++) {
            int studentNumber = student + 1;
            System.out.println("Entering Score for student " + (student + 1));
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                int subjectNumber = subject + 1;
                System.out.println("Enter score for subject " + subjectNumber);
                scores[student][subject] = inputCollector.nextInt();
                System.out.println("Entering Score for student " + studentNumber + ", subject " + subjectNumber + " Saved successfully");
            }
            System.out.println("Entering Score for student " + studentNumber + " Saved successfully");
            System.out.println("________________________________________");
            System.out.println();
        }

    }


    private static void displayScore() {
        for (int student = 0; student < numberOfStudent; student++) {
            int studentNumber = student + 1;
            System.out.println("Student " + studentNumber + "Scores");
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                int subjectNumber = subject + 1;
                System.out.println("Score for subject " + subjectNumber + " : " + scores[student][subject]);

            }
            System.out.println("________________________________________");
            System.out.println();

        }
    }
}

