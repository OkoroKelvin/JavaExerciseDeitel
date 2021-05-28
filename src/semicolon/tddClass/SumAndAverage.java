package semicolon.tddClass;


import java.util.Scanner;
public class SumAndAverage {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int num;
        double average;
        int count = 1;
        double total = 0;
        int studentNum;


        System.out.println("Kindly input numbers of student");
        studentNum = input.nextInt();

        while (count <= studentNum) {
            System.out.println("kindly input the score of student " + count);
            num = input.nextInt();
            total += num;
            count++;
        }

        average = total /studentNum;
        System.out.println("This is the sum of the number " + total);
        System.out.println("This is the average of the number " + average);
    }
}
